package com.example.mcpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class McpclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpclientApplication.class, args);
	}

}
