package com.raghsonline.sftp.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.file.remote.session.SessionFactory;
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
@EnableConfigurationProperties(SFTPProperties.class)
public class SFTPConfig {
	
	static {
	    // Add this static block to your configuration class
	    System.setProperty("PreferredAuthentications", "password");
	    System.setProperty("MaxAuthTries", "1");
	}

	private final SFTPProperties properties;

	public SFTPConfig(SFTPProperties properties) {
		this.properties = properties;
	}

	@Bean
	public SessionFactory<?> sftpSessionFactory() {
		DefaultSftpSessionFactory factory = new DefaultSftpSessionFactory();
		
        /*factory.setHost(properties.getHost());
        factory.setPort(properties.getPort());
        factory.setUser(properties.getUsername());
		// factory.setPassword(password);
		if (properties.getPrivateKey() != null && !properties.getPrivateKey().isEmpty()) {
			log.info("Using private key authentication");
			factory.setPrivateKey(new ByteArrayResource(properties.getPrivateKey().getBytes()));
			factory.setPrivateKeyPassphrase(properties.getPrivateKeyPassphrase());
		} else {
			log.info("Using password authentication");
			factory.setPassword(properties.getPassword());
		}
		factory.setAllowUnknownKeys(true); // For testing only

		// For better debugging
		// factory.setSessionConfig(Collections.singletonMap("StrictHostKeyChecking",
		// "no"));*/
		
		// 1. Basic connection settings (MUST match your terminal command)
	    factory.setHost("localhost");
	    factory.setPort(22);
	    factory.setUser(System.getProperty("user.name")); // Or hardcode your username
	    
	    // 2. Critical security setting (matches terminal behavior)
	    factory.setAllowUnknownKeys(true); // Equivalent to terminal's -o StrictHostKeyChecking=no
	    
	    // 3. Authentication (choose ONLY ONE option below)
	    // ----------------------------------------------
	    // Option A: Password authentication (like terminal)
	    factory.setPassword(properties.getPassword());
	    
	    // Option B: Key authentication (if you prefer)
	    // factory.setPrivateKey(new FileSystemResource("/Users/youruser/.ssh/id_rsa"));
	    
		
		/*// Essential configuration (matches your terminal setup)
	    factory.setHost("localhost");
	    factory.setPort(22);
	    factory.setUser(System.getProperty("user.name")); // Or your exact username
	    
	    // Critical security settings
	    factory.setAllowUnknownKeys(true); // Equivalent to -o StrictHostKeyChecking=no
	    
	    // Authentication (choose ONE of these)
	    // -----------------------------------
	    // Option 1: Password authentication (like your terminal)
	    factory.setPassword("your-actual-terminal-password");
	    
	    // Option 2: Key authentication (if preferred)
	    // factory.setPrivateKey(new FileSystemResource("/Users/youruser/.ssh/id_rsa"));
	    // factory.setPrivateKeyPassphrase("passphrase-if-any");
	    
	 // PROPER way to set session config
	    Properties sessionConfig = new Properties();
	    sessionConfig.put("PreferredAuthentications", "password,publickey");
	    sessionConfig.put("MaxAuthTries", "3");
	    factory.setSessionConfig(sessionConfig); // Correct method signature
	    
	    // Enable JSch logging (optional)
	    JSch.setLogger(new com.jcraft.jsch.Logger() {
	        public boolean isEnabled(int level) { return true; }
	        public void log(int level, String message) { 
	            System.out.println("JSCH: " + message); 
	        }
	    });*/

		return factory;
	}
}
