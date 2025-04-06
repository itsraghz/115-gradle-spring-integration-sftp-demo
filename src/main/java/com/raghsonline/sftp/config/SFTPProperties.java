package com.raghsonline.sftp.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.annotation.PostConstruct;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Validated
@ConfigurationProperties(prefix = "sftp")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Slf4j
public class SFTPProperties {
    
    @NotBlank
    private String host;
    
    @Min(1) @Max(65535)
    @Builder.Default
    private int port = 22;
    
    @NotBlank
    private String username;
    
    /*
     * Purposefully commented as this is removed from application.yml 
     * and instead passed as a JVM Argument through -Dsftp.password=<Pwd>
     */
    //@NotBlank 
    private String password;
    
    private String privateKey;
    private String privateKeyPassphrase;
    
    @Value("${sftp.enabled}")
	private boolean sftpEnabled;

	@Value("${sftp.remote.directory}")
	private String remoteDir;

	@Value("${sftp.local.directory}")
	private String localDir;

    // Getters and Setters (required for @ConfigurationProperties)
	
	public String getlocalDir() {
        return this.localDir;
    }

    public void setLocalDir(String localDir) {
    	log.info("setLocalDir called with: '" + localDir + "'");
        this.localDir = trimOrNull(localDir);
    }

    public String getRemoteDir() {
        return this.remoteDir;
    }

    public void setRemoteDir(String remoteDir) {
    	log.info("setRemoteDir called with: '" + remoteDir + "'");
        this.remoteDir = trimOrNull(remoteDir);
    }

    private String trimOrNull(String value) {
        return (value != null) ? value.trim() : null;
    }

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
}