package com.app_budget.Services;

import com.app_budget.Repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

//    public float totalMonthlyExpenses(int year, int month) {
//
//    }
}
