package com.app_budget.Repositories;

import com.app_budget.Entity.Expenses;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expenses, Integer> {
}
