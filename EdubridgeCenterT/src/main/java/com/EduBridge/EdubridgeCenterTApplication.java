package com.EduBridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EdubridgeCenterTApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdubridgeCenterTApplication.class, args);
		System.out.println("Welcome to Edubridge");
	}

}
