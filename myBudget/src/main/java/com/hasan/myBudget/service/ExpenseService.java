package com.hasan.myBudget.service;

import com.hasan.myBudget.dao.ExpenseTypes.ExpenseDao;
import com.hasan.myBudget.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private final ExpenseDao expenseDao;

    public ExpenseService(@Qualifier("ExpenseDao") ExpenseDao expenseDao) {
        this.expenseDao = expenseDao;
    }

    public List<Expense> getAll() {
        return expenseDao.getAll();
    }

    public int addExpense(Expense expense) {
        return expenseDao.AddExpense(expense);
    }
}
