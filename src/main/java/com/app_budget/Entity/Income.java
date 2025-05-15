package com.app_budget.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float amount;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private String type;
    private String user;

    public Income(){
    }
    public Income(float amount, LocalDate periodStart, LocalDate periodEnd, String type, String user) {
        this.amount = amount;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.type = type;
        this.user = user;
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
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        String expenseString = null;
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
        try {
            expenseString = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return expenseString;
    }
}