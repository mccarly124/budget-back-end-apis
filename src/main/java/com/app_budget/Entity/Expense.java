package com.app_budget.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String category;
    private String subcategory;
    private double price;
    private LocalDateTime date;
    private boolean split;
    private String note;

    public Expense(String category, String subcategory, double price, LocalDateTime date, boolean split, String note) {
        this.category = category;
        this.subcategory = subcategory;
        this.price = price;
        this.date = date;
        this.split = split;
        this.note = note;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSubcategory() {
        return subcategory;
    }
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public boolean isSplit() {
        return split;
    }
    public void setSplit(boolean split) {
        this.split = split;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", subcategory='" + subcategory + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", split=" + split +
                ", note='" + note + '\'' +
                '}';
    }

}
