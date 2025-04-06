package com.raghsonline.sftp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.raghsonline.sftp.config.SFTPProperties;

@SpringBootApplication
@ComponentScan(basePackages = {"com.raghsonline.sftp"})
@EnableConfigurationProperties(SFTPProperties.class)
public class SFTPDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SFTPDemoApplication.class, args);
	}

}
