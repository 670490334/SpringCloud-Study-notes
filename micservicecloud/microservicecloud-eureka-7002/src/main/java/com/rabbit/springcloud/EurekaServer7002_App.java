package com.rabbit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002_App.class, args);
	}
}
