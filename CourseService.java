package com.JobFindingPlatform.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.JobFindingPlatform.DTO.CourseDTO;
import com.JobFindingPlatform.Entity.Course;
import com.JobFindingPlatform.Repository.CourseRepository;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepo;
    
    public CourseDTO addCourse(CourseDTO dto) {
        Course course = new Course();
        course.setCourseTitle(dto.getCourseTitle());
        course.setCourseDescription(dto.getCourseDescription());
        course.setCourseCategory(dto.getCourseCategory());
        course.setAdminId(dto.getAdminId());
        course.setCreatedAt(LocalDateTime.now());
        course.setActive(true);
        
        Course saved = courseRepo.save(course);
        
        dto.setId(saved.getId());
        dto.setActive(saved.isActive());
        return dto;
    }
    
    public List<CourseDTO> getAllActiveCourses() {
        return courseRepo.findByActiveTrue()
            .stream()
            .map(this::mapToDTO)
            .collect(Collectors.toList());
    }
    
    public void deactivateCourse(Long id) {
        Course course = courseRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Course not found"));
        course.setActive(false);
        courseRepo.save(course);
    }
    
    private CourseDTO mapToDTO(Course course) {
        CourseDTO dto = new CourseDTO();
        dto.setId(course.getId());
        dto.setCourseTitle(course.getCourseTitle());
        dto.setCourseDescription(course.getCourseDescription());
        dto.setCourseCategory(course.getCourseCategory());
        dto.setAdminId(course.getAdminId());
        dto.setActive(course.isActive());
        return dto;
    }
}