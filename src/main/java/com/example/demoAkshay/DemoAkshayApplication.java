package com.example.demoAkshay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAkshayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAkshayApplication.class, args);
	}
	
	@RequestMapping(value="/firstApp")
	public String firstApp(){
		return "my first app";
	}

}
