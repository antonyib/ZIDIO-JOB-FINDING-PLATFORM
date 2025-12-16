package com.JobFindingPlatform.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.JobFindingPlatform.DTO.ApplicationStatusDTO;
import com.JobFindingPlatform.DTO.JobPostStatusDTO;
import com.JobFindingPlatform.DTO.UserStatusDTO;
import com.JobFindingPlatform.Repository.*;
import com.JobFindingPlatform.Enum.Role;
import com.JobFindingPlatform.Enum.ApplicationStatus;

@Service
public class DashBoardService {
    
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private JobPostRepository jobPostRepo;
    
    @Autowired
    private ApplicationRepository applicationRepo;
    
    public JobPostStatusDTO fetchJobStatus() {
        long totalJobs = jobPostRepo.count();
        
        // For demo purposes, using sample data
        // In production, you'd query actual data from database
        JobPostStatusDTO dto = new JobPostStatusDTO();
        dto.setTotalJobs((int) totalJobs);
        dto.setTotalInternships((int) (totalJobs * 0.4));
        dto.setTotalFullTimeJobs((int) (totalJobs * 0.3));
        dto.setTotalPartTimeJobs((int) (totalJobs * 0.15));
        dto.setTotalContractualJobs((int) (totalJobs * 0.10));
        dto.setTotalFreelanceJobs((int) (totalJobs * 0.05));
        
        return dto;
    }
    
    public ApplicationStatusDTO fetchApplicationStatus() {
        long totalApplications = applicationRepo.count();
        
        ApplicationStatusDTO dto = new ApplicationStatusDTO();
        dto.setTotalApplications((int) totalApplications);
        dto.setTotalShortlisted((int) (totalApplications * 0.2));
        dto.setTotalRejected((int) (totalApplications * 0.3));
        dto.setTotalPending((int) (totalApplications * 0.5));
        
        return dto;
    }
    
    public UserStatusDTO fetchUsersStatus() {
        long totalUsers = userRepo.count();
        
        UserStatusDTO dto = new UserStatusDTO();
        dto.setTotalJobseekers((int) (totalUsers * 0.7));
        dto.setTotalRecruiters((int) (totalUsers * 0.3));
        dto.setTotalBlockedUsers(0);
        dto.setTotalPaidUsers((int) (totalUsers * 0.1));
        
        return dto;
    }
}