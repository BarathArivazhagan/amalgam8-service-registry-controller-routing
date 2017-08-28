package com.barath.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarApplication.class, args);
	}
	
	@GetMapping("/")
	public String home(){
		System.out.println("WELCOME TO MICROSERVICE");
		return "WELCOME TO MICROSERVICE ";
	}
	
	@GetMapping("/api")
	public String endpoint(){
		System.out.println("WELCOME TO MICROSERVICE");
		return "WELCOME TO MICROSERVICE ";
	}
	
	
}
