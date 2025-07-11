package com.appsdeveloperblog.photoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.io.File;
import java.util.Random;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		Random r = new Random();
		File pidFile = new File("C:\\Zenith\\Process\\discovery"+r.nextInt()+".pid");
		SpringApplication springApplication = new SpringApplication(PhotoAppDiscoveryServiceApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter(pidFile));
		springApplication.run(args);
	}

}
