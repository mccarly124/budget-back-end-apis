package com.app_budget.Services;

import com.app_budget.Entity.Expense;
import com.app_budget.Repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Double totalMonthlyExpenses(int year, int month) {
        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.plusMonths(1);
        List<Expense> expenses = expenseRepository.findByDateBetween(startDate, endDate);
        return expenses.stream()
                .mapToDouble(Expense::getPrice)
                .sum();
    }


}
