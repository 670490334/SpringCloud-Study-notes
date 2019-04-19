package com.rabbit.springclound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//Config的Server
@EnableConfigServer
@SpringBootApplication
public class SpringCloud_Config_App {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud_Config_App.class, args);
	}
}
