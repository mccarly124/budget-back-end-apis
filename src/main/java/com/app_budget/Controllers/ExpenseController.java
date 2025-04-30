package com.app_budget.Controllers;

import com.app_budget.Entity.Expense;
import com.app_budget.Repositories.ExpenseRepository;
import com.app_budget.Services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path="/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private ExpenseService expenseService;

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(path="/post")
    public @ResponseBody String addNewTransaction(@RequestBody Expense expense){
        expenseRepository.save(expense);
        return "Added expense!";
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/get")
    public @ResponseBody Iterable<Expense> getAllUsers() {
        return expenseRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/total")
    public Map<String, Double> getTotalExpensesForMonth(@RequestParam int year, @RequestParam int month) {
        Double total = expenseService.totalMonthlyExpenses(year, month);
        return Collections.singletonMap("totalExpenses", total);
    }
}
