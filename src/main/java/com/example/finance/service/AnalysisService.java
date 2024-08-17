package com.example.finance.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finance.entity.*;
import com.example.finance.repository.*;

@Service
public class AnalysisService {

    @Autowired
    private ExpenseRepository expenseRepository;
    
    

    public BigDecimal calculateTotalSpending() {
        return expenseRepository.findAll().stream()
        		 .map(Expense::getAmount) 
                 .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Map<String, BigDecimal> calculateSpendingByCategory() {
        return expenseRepository.findAll().stream()
            .collect(Collectors.groupingBy(Expense::getCategory, 
                    Collectors.reducing(BigDecimal.ZERO, Expense::getAmount, BigDecimal::add)));
    }
}

