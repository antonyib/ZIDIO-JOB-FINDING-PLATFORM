package com.JobFindingPlatform.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.JobFindingPlatform.DTO.ApplicationDTO;
import com.JobFindingPlatform.Service.ApplicationService;
import com.JobFindingPlatform.Enum.ApplicationStatus;
import com.JobFindingPlatform.Enum.JobType;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "*")
public class ApplicationController {

    @Autowired
    private ApplicationService appService;
    
    @PostMapping("/apply")
    public ResponseEntity<String> apply(@RequestBody ApplicationDTO dto) {
        return ResponseEntity.ok(appService.apply(dto));
    }
    
    @GetMapping("/jobSeeker")
    public ResponseEntity<List<ApplicationDTO>> getJobSeekerApplication(@RequestParam String jobSeekerEmail) {
        return ResponseEntity.ok(appService.getByJobSeekerEmail(jobSeekerEmail));
    }
    
    @GetMapping("/recruiter")
    public ResponseEntity<List<ApplicationDTO>> getRecruiterApplication(@RequestParam String recruiterEmail) {
        return ResponseEntity.ok(appService.getByRecruiterEmail(recruiterEmail));
    }
    
    @GetMapping("/jobType")
    public ResponseEntity<List<ApplicationDTO>> getByJobType(@RequestParam JobType jobType) {
        return ResponseEntity.ok(appService.getByJobType(jobType));
    }
    
    @GetMapping("/search/{jobTitle}")
    public ResponseEntity<List<ApplicationDTO>> getByJobTitle(@PathVariable String jobTitle) {
        return ResponseEntity.ok(appService.getByJobTitle(jobTitle));
    }
    
    @PostMapping("/update-status")
    public ResponseEntity<String> updateStatus(@RequestParam Long id, @RequestParam ApplicationStatus status) {
        appService.updateStatus(id, status);
        return ResponseEntity.ok("Status updated successfully");
    }
}