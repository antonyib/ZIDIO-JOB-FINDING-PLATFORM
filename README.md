# ZIDIO-JOB-FINDING-PLATFORM
Zidio is a comprehensive web-based Internship &amp;amp; Job Management Portal that bridges the gap between students seeking opportunities and recruiters offering them. The platform provides a seamless experience for job posting, application tracking, and user management.
# Installation Guide
Prerequisites

Java Development Kit (JDK) 

Version: JDK 8 or higher
Download: Oracle JDK
Verify: java -version

MySQL Database

Version: MySQL 8.0+
Download: MySQL Installer
Default Port: 3306
Set root password during installation

Eclipse IDE

Download: Eclipse IDE for Java
Alternative: IntelliJ IDEA Community Edition

Postman (API Testing)

Download: Postman
# Key Objectives

Enable companies to post internship and job opportunities
Allow students to apply, track, and manage applications
Provide admin-level control for moderation and analytics
Facilitate seamless communication between students and recruiters

# Target Users

Students/Job Seekers: Create profiles, upload resumes, apply for jobs
Recruiters: Post opportunities, review applications, manage candidates
Admins: Moderate content, manage users, view analytics
## 📁 Project Structure
```
JOBFIND/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── JobFindingPlatform/
│   │   │           ├── Controller/
│   │   │           │   ├── AuthController.java
│   │   │           │   ├── JobSeekerController.java
│   │   │           │   ├── RecruiterController.java
│   │   │           │   ├── JobPostController.java
│   │   │           │   ├── ApplicationController.java
│   │   │           │   ├── AdminController.java
│   │   │           │   ├── PaymentController.java
│   │   │           │   ├── EmailController.java
│   │   │           │   ├── FileUploadController.java
│   │   │           │   ├── CourseController.java
│   │   │           │   └── DashBoardController.java
│   │   │           │
│   │   │           ├── Service/
│   │   │           │   ├── AuthService.java
│   │   │           │   ├── JobSeekerService.java
│   │   │           │   ├── RecruiterService.java
│   │   │           │   ├── JobPostService.java
│   │   │           │   ├── ApplicationService.java
│   │   │           │   ├── AdminService.java
│   │   │           │   ├── PaymentService.java
│   │   │           │   ├── InvoiceService.java
│   │   │           │   ├── EmailService.java
│   │   │           │   ├── FileUploadService.java
│   │   │           │   ├── CourseService.java
│   │   │           │   └── DashBoardService.java
│   │   │           │
│   │   │           ├── Repository/
│   │   │           │   ├── UserRepository.java
│   │   │           │   ├── JobSeekerRepository.java
│   │   │           │   ├── RecruiterRepository.java
│   │   │           │   ├── JobPostRepository.java
│   │   │           │   ├── ApplicationRepository.java
│   │   │           │   ├── AdminRepository.java
│   │   │           │   ├── PaymentRepository.java
│   │   │           │   ├── SubscriptionPlanRepository.java
│   │   │           │   └── CourseRepository.java
│   │   │           │
│   │   │           ├── Entity/
│   │   │           │   ├── User.java
│   │   │           │   ├── JobSeeker.java
│   │   │           │   ├── Recruiter.java
│   │   │           │   ├── JobPost.java
│   │   │           │   ├── Application.java
│   │   │           │   ├── Admin.java
│   │   │           │   ├── Payment.java
│   │   │           │   ├── SubscriptionPlan.java
│   │   │           │   └── Course.java
│   │   │           │
│   │   │           ├── DTO/
│   │   │           │   ├── RegisterRequestDTO.java
│   │   │           │   ├── LoginRequestDTO.java
│   │   │           │   ├── JobSeekerDTO.java
│   │   │           │   ├── RecruiterDTO.java
│   │   │           │   ├── JobPostDTO.java
│   │   │           │   ├── ApplicationDTO.java
│   │   │           │   ├── AdminDTO.java
│   │   │           │   ├── PaymentRequestDTO.java
│   │   │           │   ├── PaymentResponseDTO.java
│   │   │           │   ├── EmailRequestDTO.java
│   │   │           │   └── CourseDTO.java
│   │   │           │
│   │   │           ├── Security/
│   │   │           │   ├── JWTUtil.java
│   │   │           │   ├── SecurityConfig.java
│   │   │           │   └── CorsConfig.java
│   │   │           │
│   │   │           ├── Enum/
│   │   │           │   ├── Role.java
│   │   │           │   ├── Action.java
│   │   │           │   ├── ApplicationStatus.java
│   │   │           │   ├── PaymentStatus.java
│   │   │           │   ├── PlanName.java
│   │   │           │   ├── Duration.java
│   │   │           │   └── JobType.java
│   │   │           │
│   │   │           └── JobfindApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│
├── pom.xml
└── README.md
```
# Features & Modules
1. Authentication Module

User registration with role-based access (Student/Recruiter/Admin)
Secure login with JWT token-based authentication
Password encryption using BCrypt
Session management

2. Job Seeker Module

Profile creation and management
Resume upload functionality
Educational details tracking
Application history viewing
Job search and filtering

3. Recruiter Module

Company profile management
Job posting creation
Application review dashboard
Candidate shortlisting/rejection
Posted jobs management

4. Job Post Module

Create job listings with detailed descriptions
Specify job type (Full-time, Part-time, Internship, Contract, Freelance)
Location and remote work options
Job category classification
Active/inactive status management

5. Application Module

Apply to job postings
Track application status (Applied, Shortlisted, Rejected)
View application history
Status update notifications
Duplicate application prevention

6. Admin Module

User management (Block/Unblock users)
Action logging and audit trails
System moderation
User activity tracking

7. Payment Module

Subscription plan management (Free, Basic, Premium)
Payment processing with transaction IDs
Payment history tracking
Invoice generation (PDF)
Multiple duration options (Monthly, Quarterly, Yearly)

8. Email Notification Module

Application status updates
Registration confirmations
Interview invitations
Custom email notifications
SMTP integration

9. File Upload Module

Resume upload to cloud storage (Cloudinary)
Certificate upload
Profile picture management
Secure file handling (5MB limit)

10. Course Module

Learning resource management
Course categorization
Admin-controlled course activation
Course description and details

11. Dashboard Module

Statistics overview

Total jobs/internships by type
Application status breakdown
User statistics (Job seekers, Recruiters, Blocked users)


Visual data representation
Real-time metrics

12. Chat Support Module (Optional)

WebSocket-based real-time messaging
Sender/receiver tracking
Timestamp logging
Support communication
# Technology Stack
# Backend

Framework: Spring Boot 2.7.15
Language: Java 8
Build Tool: Maven
Security: Spring Security with JWT
Database: MySQL 8.0+

# Key Dependencies

Spring Boot Starter Web: REST API development
Spring Boot Starter Data JPA: Database operations
Spring Boot Starter Security: Authentication & Authorization
MySQL Connector: Database connectivity
JWT (jjwt): Token-based authentication
Lombok: Boilerplate code reduction
JavaMail: Email functionality
Cloudinary: Cloud file storage
iTextPDF: Invoice generation
Spring Boot Starter Validation: Input validation

# Database

RDBMS: MySQL
ORM: Hibernate/JPA
Schema Management: Auto-update via Hibernate

# Development Tools

IDE: Eclipse IDE
API Testing: Postman
Version Control: Git/GitHub
Server: Apache Tomcat (Embedded)
