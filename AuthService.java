package com.JobFindingPlatform.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.JobFindingPlatform.DTO.LoginRequestDTO;
import com.JobFindingPlatform.DTO.RegisterRequestDTO;
import com.JobFindingPlatform.Entity.User;
import com.JobFindingPlatform.Repository.UserRepository;
import com.JobFindingPlatform.Security.JWTUtil;

@Service
public class AuthService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired 
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private JWTUtil jwtUtil;
    
    public String register(RegisterRequestDTO dto) {
        if(userRepository.existsByName(dto.name) || userRepository.existsByEmail(dto.email)) {
            throw new RuntimeException("User already exists");
        }
        
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setRole(dto.getRole());
        
        userRepository.save(user);
        
        return "User registered successfully";
    }
    
    public String login(LoginRequestDTO dto) {
        User user = userRepository.findByEmail(dto.email)
            .orElseThrow(() -> new RuntimeException("User not found"));
        
        if(!passwordEncoder.matches(dto.password, user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        
        return jwtUtil.generateToken(user);
    }
}