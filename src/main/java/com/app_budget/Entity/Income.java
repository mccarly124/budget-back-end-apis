package com.app_budget.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime periodStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime periodEnd;
    private String type;


    public Income(float amount, LocalDateTime periodStart, LocalDateTime periodEnd, String type) {
        this.amount = amount;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.type = type;
    }

    public Long getId() {
        return id;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public LocalDateTime getPeriodStart() {
        return periodStart;
    }
    public void setPeriodStart(LocalDateTime periodStart) {
        this.periodStart = periodStart;
    }
    public LocalDateTime getPeriodEnd() {
        return periodEnd;
    }
    public void setPeriodEnd(LocalDateTime periodEnd) {
        this.periodEnd = periodEnd;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", amount=" + amount +
                ", periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                ", type='" + type + '\'' +
                '}';
    }
}