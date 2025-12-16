package com.JobFindingPlatform.DTO;

import com.JobFindingPlatform.Enum.Action;

public class AdminDTO {
    private Long adminId;
    private Long userId;
    private Action action;
    public AdminDTO() {}
    public AdminDTO(Long adminId, Long userId, Action action) {
        this.adminId = adminId;
        this.userId = userId;
        this.action = action;
    }
    public Long getAdminId() { return adminId; }
    public void setAdminId(Long adminId) { this.adminId = adminId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Action getAction() { return action; }
    public void setAction(Action action) { this.action = action; }
}