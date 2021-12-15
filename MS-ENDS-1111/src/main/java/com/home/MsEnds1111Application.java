package com.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsEnds1111Application {
// This is Eureka Netflix Discovery Server.
	public static void main(String[] args) {
		SpringApplication.run(MsEnds1111Application.class, args);
	}

}
