package com.JobFindingPlatform.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.JobFindingPlatform.DTO.JobPostDTO;
import com.JobFindingPlatform.Service.JobPostService;

@RestController
@RequestMapping("/api/jobPost")
@CrossOrigin(origins = "*")
public class JobPostController {
    
    @Autowired
    private JobPostService jobPostService;
    
    @PostMapping 
    public ResponseEntity<JobPostDTO> createJobs(@RequestBody JobPostDTO dto) {
        return ResponseEntity.ok(jobPostService.createJob(dto));
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<JobPostDTO>> getAllJobs() {
        return ResponseEntity.ok(jobPostService.getAllJobs());
    }
    
    @GetMapping("/search/company/{companyName}")
    public ResponseEntity<List<JobPostDTO>> getJobByCompanyName(@PathVariable String companyName) {
        return ResponseEntity.ok(jobPostService.findJobByCompanyName(companyName));
    }
    
    @GetMapping("/recruiters/{recruiterEmail}")
    public ResponseEntity<List<JobPostDTO>> getJobByRecruiterEmail(@PathVariable String recruiterEmail) {
        return ResponseEntity.ok(jobPostService.findJobByRecruiterEmail(recruiterEmail));
    }
    
    @GetMapping("/search/title/{jobTitle}")
    public ResponseEntity<List<JobPostDTO>> getJobByJobTitle(@PathVariable String jobTitle) {
        return ResponseEntity.ok(jobPostService.findJobByJobTitle(jobTitle));
    }
}