package com.example.Expense_Tracker2.Service;

//public class ExpenseServiceImpl {}
//package com.example.expense_tracker2.service.impl;

import com.example.Expense_Tracker2.Entity.Expense;
import com.example.Expense_Tracker2.Repository.ExpenseRepository;
import com.example.Expense_Tracker2.Service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository repository;

    @Override
    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    @Override
    public Expense getExpenseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Expense updateExpense(Long id, Expense expense) {
        Expense existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setTitle(expense.getTitle());
            existing.setAmount(expense.getAmount());
            existing.setCategory(expense.getCategory());
            existing.setDate(expense.getDate());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }
}
