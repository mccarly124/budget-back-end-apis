package com.app_budget.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;

@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float amount;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private String type;

    public Income(){
    }
    public Income(float amount, LocalDate periodStart, LocalDate periodEnd, String type) {
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
    public LocalDate getPeriodStart() {
        return periodStart;
    }
    public void setPeriodStart(LocalDate periodStart) {
        this.periodStart = periodStart;
    }
    public LocalDate getPeriodEnd() {
        return periodEnd;
    }
    public void setPeriodEnd(LocalDate periodEnd) {
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