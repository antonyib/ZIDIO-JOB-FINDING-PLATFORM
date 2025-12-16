package com.JobFindingPlatform.Entity;

import javax.persistence.*;
import com.JobFindingPlatform.Enum.Duration;
import com.JobFindingPlatform.Enum.PlanName;

@Entity
@Table(name="plans")
public class SubscriptionPlan {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PlanName planName;
    private Double price;
    private String currency;
    @Enumerated(EnumType.STRING)
    private Duration duration;
    @Column(length = 1000)
    private String features;
    public SubscriptionPlan() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public PlanName getPlanName() { return planName; }
    public void setPlanName(PlanName planName) { this.planName = planName; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public Duration getDuration() { return duration; }
    public void setDuration(Duration duration) { this.duration = duration; }
    public String getFeatures() { return features; }
    public void setFeatures(String features) { this.features = features; }
}