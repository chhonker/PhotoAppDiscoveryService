package com.appsdeveloperblog.photoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		Random r = new Random();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String dateTime = LocalDateTime.now().format(formatter);
		File pidFile = new File("C:\\Zenith\\Process\\discovery"+dateTime+"-"+r.nextInt(1000,2000)+".pid");
		SpringApplication springApplication = new SpringApplication(PhotoAppDiscoveryServiceApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter(pidFile));
		springApplication.run(args);
	}

}
