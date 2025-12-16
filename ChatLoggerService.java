package com.JobFindingPlatform.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatLoggerService {
    
    public void logConnection(String message) {
        System.out.println("WebSocket Log: " + message);
    }
    
    public void logMessage(String senderId, String receiverId, String message) {
        System.out.println("Chat Message - From: " + senderId + 
                         " To: " + receiverId + 
                         " Message: " + message);
    }
}