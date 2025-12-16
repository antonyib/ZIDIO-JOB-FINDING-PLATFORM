package com.JobFindingPlatform.DTO;

public class UserStatusDTO {
    public int totalJobseekers;
    public int totalRecruiters;
    public int totalBlockedUsers;
    public int totalPaidUsers;
    public UserStatusDTO() {}
    public UserStatusDTO(int totalJobseekers, int totalRecruiters, int totalBlockedUsers, int totalPaidUsers) {
        this.totalJobseekers = totalJobseekers;
        this.totalRecruiters = totalRecruiters;
        this.totalBlockedUsers = totalBlockedUsers;
        this.totalPaidUsers = totalPaidUsers;
    }
    public int getTotalJobseekers() { return totalJobseekers; }
    public void setTotalJobseekers(int totalJobseekers) { this.totalJobseekers = totalJobseekers; }
    public int getTotalRecruiters() { return totalRecruiters; }
    public void setTotalRecruiters(int totalRecruiters) { this.totalRecruiters = totalRecruiters; }
    public int getTotalBlockedUsers() { return totalBlockedUsers; }
    public void setTotalBlockedUsers(int totalBlockedUsers) { this.totalBlockedUsers = totalBlockedUsers; }
    public int getTotalPaidUsers() { return totalPaidUsers; }
    public void setTotalPaidUsers(int totalPaidUsers) { this.totalPaidUsers = totalPaidUsers; }
}