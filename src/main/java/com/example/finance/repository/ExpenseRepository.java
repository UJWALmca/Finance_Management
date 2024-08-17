package com.example.finance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finance.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByCategory(String category);
}
