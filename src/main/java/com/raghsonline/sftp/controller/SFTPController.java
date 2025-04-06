package com.raghsonline.sftp.controller;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raghsonline.sftp.config.SFTPProperties;
import com.raghsonline.sftp.dto.ApiResponse;
import com.raghsonline.sftp.service.SFTPService;
import com.raghsonline.sftp.util.RequestLogUtil;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/sftp")
@RequiredArgsConstructor
@Slf4j
public class SFTPController {
	
	private final SFTPService sftpService;// Should be final for @RequiredArgsConstructor
	
	private final SFTPProperties sftpProperties;
	
	@GetMapping("/test")
	public String test() {
		log.info("Request received for '/'");
	    return "Controller is working!";
	}
	
	@PostMapping("/upload")
	public ResponseEntity<ApiResponse> upload(
			@RequestParam(name = "fileName", required = true) String fileName,
	        @RequestParam(name = "content", required = true) String content) 
	throws IOException{
		log.info("/upload - Request received");
		
		log.info("Connecting as {}@{}", sftpProperties.getUsername(),sftpProperties.getHost());
		try {
	        sftpService.upload(fileName, content);
	     // Return success response
	        return ResponseEntity.status(HttpStatus.CREATED)
	                .body(new ApiResponse(true, "File uploaded successfully", fileName));
	    } catch (SecurityException e) {
	        return ResponseEntity.badRequest()
	                .body(new ApiResponse(false, "Invalid filename: " + e.getMessage(), fileName));
	    } catch (IOException e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body(new ApiResponse(false, "File upload failed: " + e.getMessage(), fileName));
	    }
	}
	
	@GetMapping("/view")
    public ResponseEntity<ApiResponse> viewFile(
    		@RequestParam(name = "fileName", required = true) String filename) 
    throws IOException {
		log.info("/view - Request received");
        String fileContent = sftpService.viewFileContent(filename);
        
        return ResponseEntity.status(HttpStatus.OK)
        		.body(new ApiResponse(true, fileContent, filename));
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponse> listFiles() throws IOException {
    	log.info("/list - Request received");
    	
        String[] files = sftpService.listFiles();
        log.info("No. of files - {}", files.length);
        Stream.of(files).forEach(x -> log.debug(" |%| File -> [" + x + "]"));
        
        //return files;
        return ResponseEntity.status(HttpStatus.OK)
        		.body(ApiResponse.of(true, "success", "N/A", files));
    }
    
    /*@GetMapping("/list")
    public ResponseEntity<ApiResponse<List<FileInfo>>> listFiles() {
        try {
            SftpClient.DirEntry[] files = sftpService.listFiles();
            
            List<FileInfo> fileList = Arrays.stream(files)
                    .map(file -> new FileInfo(
                            file.getFilename(),
                            file.getAttributes().getSize(),
                            file.getAttributes().isDirectory()
                    ))
                    .collect(Collectors.toList());
            
            return ResponseEntity.ok(
                    new ApiResponse<>("Success", fileList)
            );
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse<>("Failed to list files: " + e.getMessage(), null));
        }
    }*/
    
    @PostMapping("/upload-local")
    public ResponseEntity<ApiResponse> uploadLocal(
    		@RequestParam(name = "localFileName", required = true) String localFileName,
    		@RequestParam(name = "remoteFileName", required = true) String remoteFileName,
    		HttpServletRequest request) 
    throws IOException {
    	log.info(RequestLogUtil.logRequestDetails(request));
    	
    	try {
    		sftpService.uploadLocalFile(localFileName, remoteFileName);
    		
        	String msg = String.format("Local file {%s} uploaded to SFTP {%s}", 
        			localFileName, remoteFileName);
        	log.info(msg);
        	
	     // Return success response
	        return ResponseEntity.status(HttpStatus.OK)
	                .body(new ApiResponse(true, "File uploaded successfully", localFileName));
	    } catch (IOException e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body(new ApiResponse(false, "File upload failed: " + e.getMessage(), localFileName));
	    }
 
    }
    
    @PostMapping("/download-to-local")
    public ResponseEntity<ApiResponse> downloadToLocal(    		
    		@RequestParam(name = "remoteFileName", required = true) String remoteFileName,
    		@RequestParam(name = "localFileName", required = true) String localFileName,
    		HttpServletRequest request)
    throws IOException {
    	log.info(RequestLogUtil.logRequestDetails(request));
    	
    	try {
    		sftpService.downloadToLocalFile(remoteFileName, localFileName);
        	
        	String msg = String.format("Remote file {%s} from the Server downloaded to local {%s} via SFTP", 
        			remoteFileName,localFileName);
        	log.info(msg);
        	
        	 // Return success response
	        return ResponseEntity.status(HttpStatus.OK)
	                .body(new ApiResponse(true, "Remote File Downloaded successfully", localFileName));
	    } catch (IOException e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body(new ApiResponse(false, "File Download failed: " + e.getMessage(), remoteFileName));
	    }
    }

}
