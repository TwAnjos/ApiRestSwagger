package com.tw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ApiRestSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSwaggerApplication.class, args);
	}

}
