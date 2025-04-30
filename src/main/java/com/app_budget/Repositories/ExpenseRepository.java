package com.app_budget.Repositories;

import com.app_budget.Entity.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {
}
