package com.JobFindingPlatform.DTO;

public class PaymentRequestDTO {
    private Long userId;
    private Long planId;
    private Double amount;
    public PaymentRequestDTO() {}
    public PaymentRequestDTO(Long userId, Long planId, Double amount) {
        this.userId = userId;
        this.planId = planId;
        this.amount = amount;
    }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Long getPlanId() { return planId; }
    public void setPlanId(Long planId) { this.planId = planId; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}