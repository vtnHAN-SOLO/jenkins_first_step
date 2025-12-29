package com.example.devops_testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsTestingApplication {

	@GetMapping("/test")
	public String test_message() {
		return "this is the test message, <section for webhook>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsTestingApplication.class, args);
	}

}
