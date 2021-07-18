package com.hasan.myBudget.dao.ExpenseTypes;

import com.hasan.myBudget.model.Expense;

import java.util.List;

public interface ExpenseDao {
    List<Expense> getAll();

    int AddExpense(Expense expense);
}
