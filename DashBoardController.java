package com.JobFindingPlatform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.JobFindingPlatform.DTO.ApplicationStatusDTO;
import com.JobFindingPlatform.DTO.JobPostStatusDTO;
import com.JobFindingPlatform.DTO.UserStatusDTO;
import com.JobFindingPlatform.Service.DashBoardService;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashBoardController {
    
    @Autowired
    private DashBoardService dashBoardService;
    
    @GetMapping("/jobs")
    public ResponseEntity<JobPostStatusDTO> fetchJobs() {
        return ResponseEntity.ok(dashBoardService.fetchJobStatus());
    }

    @GetMapping("/applications")
    public ResponseEntity<ApplicationStatusDTO> fetchApplications() {
        return ResponseEntity.ok(dashBoardService.fetchApplicationStatus());
    }
    
    @GetMapping("/users")
    public ResponseEntity<UserStatusDTO> fetchUsers() {
        return ResponseEntity.ok(dashBoardService.fetchUsersStatus());
    }
}