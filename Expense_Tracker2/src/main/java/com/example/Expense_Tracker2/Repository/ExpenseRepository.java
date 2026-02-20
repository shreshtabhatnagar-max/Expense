package com.example.Expense_Tracker2.Repository;

import com.example.Expense_Tracker2.Entity.Expense;


//package com.example.expense_tracker2.repository;

//import com.example.Expense_Tracker2.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
