package com.app_budget.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date periodStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date periodEnd;
    private String type;


    public Long getId() {
        return id;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public Date getPeriodStart() {
        return periodStart;
    }
    public void setPeriodStart(Date periodStart) {
        this.periodStart = periodStart;
    }
    public Date getPeriodEnd() {
        return periodEnd;
    }
    public void setPeriodEnd(Date periodEnd) {
        this.periodEnd = periodEnd;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}