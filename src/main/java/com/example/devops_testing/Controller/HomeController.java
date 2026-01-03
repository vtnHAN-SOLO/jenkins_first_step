package com.example.devops_testing.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Hello from Jenkins!</h1><p>The Spring Boot App is active on port 8090.</p>";
    }
}
