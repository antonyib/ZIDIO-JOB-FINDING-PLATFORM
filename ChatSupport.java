package com.JobFindingPlatform.Entity;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name="chatSupport")
public class ChatSupport {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String senderId;
    private String receiverId;
    @Column(length = 2000)
    private String message;
    private LocalDateTime timeStamp;
    public ChatSupport() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSenderId() { return senderId; }
    public void setSenderId(String senderId) { this.senderId = senderId; }
    public String getReceiverId() { return receiverId; }
    public void setReceiverId(String receiverId) { this.receiverId = receiverId; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public LocalDateTime getTimeStamp() { return timeStamp; }
    public void setTimeStamp(LocalDateTime timeStamp) { this.timeStamp = timeStamp; }
}