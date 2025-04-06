package com.raghsonline.sftp.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.apache.sshd.sftp.client.SftpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.integration.file.remote.session.Session;
import org.springframework.integration.file.remote.session.SessionFactory;
import org.springframework.integration.sftp.session.SftpSession;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class SFTPService {

	private final SessionFactory<?> sftpSessionFactory;

	@Value("${sftp.enabled}")
	private boolean sftpEnabled;

	@Value("${sftp.remote.directory}")
	private String remoteDir;

	@Value("${sftp.local.directory}")
	private String localDir;

	@PostConstruct
	public void sanitizePaths() {
		log.info("postConstruct - sanitizePaths() invoked");
		log.info("localDir - []", localDir);
		if (localDir != null) {
			localDir = localDir.trim();
			log.info("after trimming, localDir - []", localDir);
		}

		log.info("remoteDir - []", remoteDir);
		if (remoteDir != null) {
			remoteDir = remoteDir.trim();
			log.info("after trimming, remoteDir - []", remoteDir);
		}
	}

	// ✅ Correct: Ensures forward slashes for SFTP
	private String buildRemotePath(String fileName) {

		// Prevent path traversal attacks
		if (fileName.contains("../") || fileName.contains("..\\")) {
			throw new SecurityException("Invalid filename");
		}

		// Ensure directory ends with separator
		if (!remoteDir.endsWith("/")) {
			remoteDir += "/";
		}

		// Normalize and ensure forward slashes
		return remoteDir.replace('\\', '/') + fileName.replace('\\', '/');
	}

	// ✅ Alternative using Paths.get() (for local paths)
	private Path buildLocalPath(String fileName) {
		return Paths.get(localDir, fileName);
	}

	// Upload the contents supplied to a file in the Remote Server via SFTP
	public void upload(String fileName, String content) throws IOException {
		if (!sftpEnabled) {
			log.error("SFTP is disabled. Skipping upload!");
		}

		try (Session session = sftpSessionFactory.getSession()) {
			// String remotePath = remoteDir + fileName;

			// ✅ Recommended: Platform-independent path construction
			// String remotePath = Paths.get(remoteDir, fileName).toString();

			String remotePath = buildRemotePath(fileName); // Uses forward slashes
			// String localPath = buildLocalPath(localDir, fileName); // OS-specific

			/**
			 * ByteArrayInputStream will load the entire file contents into memory. It may
			 * be a good fit only for the small sized files, like this one as we are
			 * transferring the direct content into the file in the remote server.
			 */
			InputStream byteArrayInputStream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
			session.write(byteArrayInputStream, remotePath);

			log.info("Uploaded the file to - {}", remotePath);
		}
	}

	// public void transfer(InputStream inputStream, )

	// View the contents of a file from SFTP
	public String viewFileContent(String fileName) throws IOException {
		if (!sftpEnabled) {
			log.error("SFTP Disabled. Skipping download");
			return null;
		}

		try (Session session = sftpSessionFactory.getSession()) {
			// ✅ Recommended: Platform-independent path construction
			// String remotePath = Paths.get(remoteDir, fileName).toString();

			String remotePath = buildRemotePath(fileName); // Uses forward slashes
			// String localPath = buildLocalPath(localDir, fileName); // OS-specific

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			session.read(remotePath, outputStream);
			String outputContent = outputStream.toString(StandardCharsets.UTF_8);
			log.info("outputContent - {}", outputContent);
			return outputContent;
		}
	}

	// List files in the SFTP directory
	public String[] listFiles() throws IOException {
		if (!sftpEnabled) {
			log.error("SFTP disabled. Skipping the listing");
			return new String[0];
		}

		try (Session session = sftpSessionFactory.getSession()) {
			// String[] files = session.list(remoteDir);

			/*
			 * String[] files = Arrays.stream(session.list(remoteDir)) .map(obj ->
			 * ((SftpClient.DirEntry)obj).getFilename()) .toArray(String[]::new);
			 */
			String[] files = getFiles(session, remoteDir);

			Stream.of(files).forEach(x -> log.info(" |*| File : " + x));

			return files;
		}
	}

	private String[] getFiles(Session session, String remoteDir) throws IOException {
		return getFiles(session, remoteDir, true);
	}

	/**
	 * <p>
	 * A method to conditionally omit the skipSystemLevelPseudoEntries - ".", ".."
	 * etc. from the files listed from a directory
	 * </p>
	 * 
	 * @param session
	 * @param remoteDir
	 * @param skipSystemLevelPseudoEntries
	 * @return
	 * @throws IOException
	 */
	private String[] getFiles(Session session, String remoteDir, boolean skipSystemLevelPseudoEntries)
			throws IOException {

		// Direct way, one time
		/*
		 * Predicate<SftpClient.DirEntry> filterPredicate = skipSystemLevelPseudoEntries
		 * ? entry -> { String name = entry.getFilename(); return !name.equals(".") &&
		 * !name.equals(".."); } : entry -> true; // Accept all entries if skipping is
		 * disabled
		 */

		// Better way to keep a filter composable to accept more conditions later
		Predicate<SftpClient.DirEntry> baseFilter = entry -> true;

		Predicate<SftpClient.DirEntry> filterPredicate = baseFilter;
		if (skipSystemLevelPseudoEntries) {
			filterPredicate = baseFilter.and(entry -> {
				String name = entry.getFilename();
				return !name.equals(".") && !name.equals("..");
			});
		}
		return Arrays.stream(session.list(remoteDir)).map(obj -> (SftpClient.DirEntry) obj).filter(filterPredicate)
				.map(SftpClient.DirEntry::getFilename)
				// .collect(Collectors.toList())
				.toArray(String[]::new);
	}

	// List files with metadata (size, permission etc.,)
	public SftpClient.DirEntry[] listFilesWithMetadata() throws IOException {
		if (!sftpEnabled) {
			log.error("SFTP is disabled. Skipping listing.");
			return new SftpClient.DirEntry[0];
		}

		try (Session session = sftpSessionFactory.getSession();
				// Safe cast to SftpSession
				SftpSession sftpSession = (SftpSession) session) {
			return Arrays.stream(sftpSession.list(remoteDir)).toArray(SftpClient.DirEntry[]::new);
		}
	}

	/**
	 * <p>
	 * A method to upload a local file to a remote file using SFTP
	 * </p>
	 * 
	 * @param localFileName  the name of the file in the local file system
	 * @param remoteFileName the name of the file in the remote file system
	 * @throws IOException any exception to be thrown while processing
	 */
	public void uploadLocalFile(String localFileName, String remoteFileName) throws IOException {
		if (!sftpEnabled) {
			log.error("SFTP is disabled. Skipping the download");
			return;
		}

		Path localPath = buildLocalPath(localFileName); // OS-specific
		log.info("localPath : {}", localPath);
		log.info("localPath.toString : {}", localPath.toString());

		Resource resource = new UrlResource(localPath.toUri());
		log.info("resource : {}", resource);

		if (!resource.exists()) {
			String errorMsg = "Local File not found - {}" + localPath.toString();
			log.error(errorMsg);
			throw new FileNotFoundException(errorMsg);
		}

		try (Session session = sftpSessionFactory.getSession()) {
			InputStream inputStream = resource.getInputStream();
			String remotePath = buildRemotePath(remoteFileName); // Uses forward slashes
			session.write(inputStream, remotePath);

			log.info("Uploaded local file - {} to the remote file in SFTP - {}", localPath.toString(), remotePath);
		}
	}

	/**
	 * <p>
	 * A method to download a file from the Remote server to the local File System
	 * via SFTP
	 * </p>
	 * 
	 * @param remoteFileName the name of the file in the remote file system
	 * @param localFileName  the name of the file in the local file system
	 * @throws IOException any exception to be thrown while processing
	 */
	public void downloadToLocalFile(String remoteFileName, String localFileName) throws IOException {
		if (!sftpEnabled) {
			log.error("SFTP is disabled. Skipping the download");
			return;
		}

		Path localPath = buildLocalPath(localFileName);
		log.info("localPath : {}", localPath);
		log.info("localPath.toString : {}", localPath.toString());

		try (Session session = sftpSessionFactory.getSession()) {
			OutputStream outputStream = new FileOutputStream(localPath.toFile());
			String remotePath = buildRemotePath(remoteFileName); // Uses forward slashes
			session.read(remotePath, outputStream);

			log.info("Downloaded the remote file - {} from SFTP Server to the local file - {}", remotePath,
					localPath.toString());
		}
	}
}