package com.JobFindingPlatform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.JobFindingPlatform.DTO.JobSeekerDTO;
import com.JobFindingPlatform.Service.JobSeekerService;

@RestController
@RequestMapping("/api/jobSeekers")
@CrossOrigin(origins = "*")
public class JobSeekerController {
    
    @Autowired
    private JobSeekerService jobSeekerService;
    
    @PostMapping
    public ResponseEntity<JobSeekerDTO> saveJobSeeker(@RequestBody JobSeekerDTO dto) {
        return ResponseEntity.ok(jobSeekerService.createOrUpdate(dto));
    }
    
    @GetMapping("/{email}")
    public ResponseEntity<JobSeekerDTO> getJobSeekerByEmail(@PathVariable String email) {
        return ResponseEntity.ok(jobSeekerService.getJobSeekerByEmail(email));
    }
}