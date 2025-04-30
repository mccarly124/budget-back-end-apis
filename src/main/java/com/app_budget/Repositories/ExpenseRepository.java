package com.app_budget.Repositories;

import com.app_budget.Entity.Expense;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {
    List<Expense> findByDateBetween(LocalDate start, LocalDate end);
}
