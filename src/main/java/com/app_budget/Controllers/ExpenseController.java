package com.app_budget.Controllers;

import com.app_budget.Entity.Expenses;
import com.app_budget.Repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(path="/post")
    public @ResponseBody String addNewTransaction(@RequestBody Expenses expense){
        expenseRepository.save(expense);
        return "Added expense!";
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/get")
    public @ResponseBody Iterable<Expenses> getAllUsers() {
        return expenseRepository.findAll();
    }
}
