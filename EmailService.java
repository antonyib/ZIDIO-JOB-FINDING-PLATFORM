package com.JobFindingPlatform.Service;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.JobFindingPlatform.DTO.EmailRequestDTO;

@Service
public class EmailService {
    
    @Value("${spring.mail.username}")
    private String fromEmail;
    
    @Value("${spring.mail.password}")
    private String password;
    
    public void sendEmail(EmailRequestDTO dto) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
        
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(dto.getTo()));
            message.setSubject(dto.getSubject());
            message.setText(dto.getBody());
            
            Transport.send(message);
            System.out.println("Email sent to " + dto.getTo());
        } catch (MessagingException e) {
            throw new RuntimeException("Failed to send email", e);
        }
    }
}