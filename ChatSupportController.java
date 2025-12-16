package com.JobFindingPlatform.Controller;

import java.time.LocalDateTime;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.JobFindingPlatform.Entity.ChatSupport;

@Controller
public class ChatSupportController {
    
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatSupport sendMessage(ChatSupport message) {
        message.setTimeStamp(LocalDateTime.now());
        return message;
    }
}