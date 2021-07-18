package com.hasan.myBudget.dao.ExpenseTypes;

import com.hasan.myBudget.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ExpenseDao")
public class ExpenseDataAccess implements ExpenseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Expense> getAll() {
        String sql = "SELECT * FROM expenses_types";
        return jdbcTemplate.query(sql, new ExpensesMapper());
    }

    @Override
    public int AddExpense(Expense expense) {
        var sql = "INSERT INTO expenses_types (name)" +
                "VALUES (?)";
        return jdbcTemplate.update(sql, expense.getName());
    }
}
