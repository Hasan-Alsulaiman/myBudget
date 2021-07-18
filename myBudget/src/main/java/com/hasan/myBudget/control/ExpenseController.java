package com.hasan.myBudget.control;

import com.hasan.myBudget.model.Expense;
import com.hasan.myBudget.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.OnError;
import java.util.List;

@RestController
@RequestMapping("api")
public class ExpenseController {
    @Autowired
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("getAll")
    public List<Expense> getAll() {
        return expenseService.getAll();
    }

    @PostMapping(path = "Add")
    public int addExpense(@RequestBody Expense name) {
       return expenseService.addExpense(name);
    }
}
