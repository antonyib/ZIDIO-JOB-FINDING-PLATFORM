package com.JobFindingPlatform.Entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import com.JobFindingPlatform.Enum.Action;

@Entity
@Table(name="adminUsers")
public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long adminId;
    private Long userId;
    @Enumerated(EnumType.STRING)
    private Action action;
    private LocalDateTime timeStamp;
    public Admin() {}
    public Admin(Long id, Long adminId, Long userId, Action action, LocalDateTime timeStamp) {
        this.id = id; this.adminId = adminId; this.userId = userId; this.action = action; this.timeStamp = timeStamp;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAdminId() { return adminId; }
    public void setAdminId(Long adminId) { this.adminId = adminId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Action getAction() { return action; }
    public void setAction(Action action) { this.action = action; }
    public LocalDateTime getTimeStamp() { return timeStamp; }
    public void setTimeStamp(LocalDateTime timeStamp) { this.timeStamp = timeStamp; }
}