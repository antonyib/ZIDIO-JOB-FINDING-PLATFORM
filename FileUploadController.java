package com.JobFindingPlatform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.JobFindingPlatform.Service.FileUploadService;

@RestController
@RequestMapping("/api/upload")
@CrossOrigin(origins = "*")
public class FileUploadController {
    
    @Autowired
    private FileUploadService fileUploadService;
    
    @PostMapping("/resume")
    public ResponseEntity<String> uploadResume(@RequestParam("file") MultipartFile file) throws Exception {
        String url = fileUploadService.uploadFile(file, "resumes");
        return ResponseEntity.ok(url);
    }
    
    @PostMapping("/image")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) throws Exception {
        String url = fileUploadService.uploadFile(file, "images");
        return ResponseEntity.ok(url);
    }
    
    @PostMapping("/certificate")
    public ResponseEntity<String> uploadCertificate(@RequestParam("file") MultipartFile file) throws Exception {
        String url = fileUploadService.uploadFile(file, "certificates");
        return ResponseEntity.ok(url);
    }
}