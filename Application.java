package com.JobFindingPlatform.Entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import com.JobFindingPlatform.Enum.ApplicationStatus;
import com.JobFindingPlatform.Enum.JobType;

@Entity
@Table(name="applications")
public class Application {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String jobSeekerName;
    private String jobSeekerEmail;
    private Long jobId;
    private String jobTitle;
    
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    
    private String recruiterEmail;
    
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status = ApplicationStatus.APPLIED;
    
    private LocalDateTime appliedAt = LocalDateTime.now();
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getJobSeekerName() { return jobSeekerName; }
    public void setJobSeekerName(String jobSeekerName) { this.jobSeekerName = jobSeekerName; }
    
    public String getJobSeekerEmail() { return jobSeekerEmail; }
    public void setJobSeekerEmail(String jobSeekerEmail) { this.jobSeekerEmail = jobSeekerEmail; }
    
    public Long getJobId() { return jobId; }
    public void setJobId(Long jobId) { this.jobId = jobId; }
    
    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    
    public JobType getJobType() { return jobType; }
    public void setJobType(JobType jobType) { this.jobType = jobType; }
    
    public String getRecruiterEmail() { return recruiterEmail; }
    public void setRecruiterEmail(String recruiterEmail) { this.recruiterEmail = recruiterEmail; }
    
    public ApplicationStatus getStatus() { return status; }
    public void setStatus(ApplicationStatus status) { this.status = status; }
    
    public LocalDateTime getAppliedAt() { return appliedAt; }
    public void setAppliedAt(LocalDateTime appliedAt) { this.appliedAt = appliedAt; }
}