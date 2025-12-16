package com.JobFindingPlatform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.JobFindingPlatform.DTO.EmailRequestDTO;
import com.JobFindingPlatform.Service.EmailService;

@RestController
@RequestMapping("/api/notifications")
@CrossOrigin(origins = "*")
public class EmailController {

    @Autowired
    private EmailService emailService;
    
    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequestDTO dto) {
        emailService.sendEmail(dto);
        return ResponseEntity.ok("Email sent successfully");
    }
}
