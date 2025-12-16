package com.JobFindingPlatform.DTO;

import com.JobFindingPlatform.Enum.PaymentStatus;

public class PaymentResponseDTO {
    private String transactionId;
    private PaymentStatus paymentStatus;
    private Double amount;
    public PaymentResponseDTO() {}
    public PaymentResponseDTO(String transactionId, PaymentStatus paymentStatus, Double amount) {
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public PaymentStatus getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(PaymentStatus paymentStatus) { this.paymentStatus = paymentStatus; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}