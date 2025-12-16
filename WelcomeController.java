// ============================================
// File: WelcomeController.java
// Location: src/main/java/com/JobFindingPlatform/Controller/WelcomeController.java
// REPLACE YOUR EXISTING FILE WITH THIS
// ============================================
package com.JobFindingPlatform.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public Map<String, Object> welcome() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "✅ Welcome to Zidio Connect - Job Finding Platform");
        response.put("status", "Server is running successfully");
        response.put("version", "1.0.0");
        response.put("port", 8080);
        
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("Register User", "POST /api/auth/register");
        endpoints.put("Login", "POST /api/auth/login");
        endpoints.put("View All Jobs", "GET /api/jobposts/all");
        endpoints.put("Create Job Post", "POST /api/jobposts/create");
        endpoints.put("Apply for Job", "POST /api/applications/apply");
        
        response.put("available_endpoints", endpoints);
        response.put("note", "Use Postman to test POST endpoints. Browser can only test GET endpoints.");
        
        return response;
    }

    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        Map<String, String> health = new HashMap<>();
        health.put("status", "UP");
        health.put("message", "Application is healthy");
        health.put("timestamp", java.time.LocalDateTime.now().toString());
        return health;
    }
    
    @GetMapping("/test")
    public Map<String, String> test() {
        Map<String, String> test = new HashMap<>();
        test.put("status", "SUCCESS");
        test.put("message", "Your application is working perfectly!");
        return test;
    }
}