package com.rabbit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EurekaServer 服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
