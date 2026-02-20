package com.example.Expense_Tracker2.Service;

//public class ExpenseService {}
//package com.example.expense_tracker2.service;

import com.example.Expense_Tracker2.Entity.Expense;
import java.util.List;

public interface ExpenseService {

    Expense addExpense(Expense expense);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id, Expense expense);

    void deleteExpense(Long id);
}
