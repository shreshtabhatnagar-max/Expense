package com.example.Expense_Tracker2.Entity;


//package com.example.expense_tracker2.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private double amount;

    private String category;

    private LocalDate date;
}

