package com.JobFindingPlatform.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.JobFindingPlatform.DTO.CourseDTO;
import com.JobFindingPlatform.Service.CourseService;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {
    
    @Autowired
    private CourseService courseService;
    
    @PostMapping("/add")
    public ResponseEntity<CourseDTO> addCourse(@RequestBody CourseDTO dto) {
        return ResponseEntity.ok(courseService.addCourse(dto));
    }
    
    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllActiveCourses());
    }
    
    @PutMapping("/deactivate/{id}")
    public ResponseEntity<String> deactivateCourse(@PathVariable Long id) {
        courseService.deactivateCourse(id);
        return ResponseEntity.ok("Course deactivated successfully");
    }
}
