package com.JobFindingPlatform.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.JobFindingPlatform.DTO.PaymentRequestDTO;
import com.JobFindingPlatform.DTO.PaymentResponseDTO;
import com.JobFindingPlatform.Entity.Payment;
import com.JobFindingPlatform.Entity.SubscriptionPlan;
import com.JobFindingPlatform.Repository.PaymentRepository;
import com.JobFindingPlatform.Repository.SubscriptionPlanRepository;
import com.JobFindingPlatform.Service.PaymentService;
import com.JobFindingPlatform.Service.InvoiceService;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "*")
public class PaymentController {
    
    @Autowired
    private PaymentService paymentService;
    
    @Autowired
    private SubscriptionPlanRepository subPlanRepo;
    
    @Autowired
    private PaymentRepository paymentRepo;
    
    @Autowired
    private InvoiceService invoiceService;
    
    @PostMapping("/process")
    public ResponseEntity<PaymentResponseDTO> processPayment(@RequestBody PaymentRequestDTO dto) {
        return ResponseEntity.ok(paymentService.processPayment(dto));
    }
    
    @GetMapping("/plans")
    public ResponseEntity<List<SubscriptionPlan>> getPlans() {
        return ResponseEntity.ok(subPlanRepo.findAll());
    }
    
    @PostMapping("/plans")
    public ResponseEntity<SubscriptionPlan> createPlan(@RequestBody SubscriptionPlan plan) {
        return ResponseEntity.ok(subPlanRepo.save(plan));
    }
    
    @GetMapping("/history/{userId}")
    public ResponseEntity<List<Payment>> getPaymentHistory(@PathVariable Long userId) {
        return ResponseEntity.ok(paymentService.getPaymentHistory(userId));
    }
    
    @GetMapping("/invoice/{paymentId}")
    public ResponseEntity<byte[]> downloadInvoice(@PathVariable Long paymentId) {
        Payment payment = paymentRepo.findById(paymentId)
            .orElseThrow(() -> new RuntimeException("Payment not found"));
        
        byte[] pdfBytes = invoiceService.generateInvoice(payment);
        
        return ResponseEntity.ok()
            .header("Content-Disposition", "attachment; filename=Invoice-" + 
                    payment.getTransactionId() + ".pdf")
            .contentType(MediaType.APPLICATION_PDF)
            .body(pdfBytes);
    }
}