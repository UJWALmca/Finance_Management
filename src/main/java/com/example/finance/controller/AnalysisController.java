package com.example.finance.controller;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance.service.AnalysisService;

@RestController
@RequestMapping("/api/analysis")
public class AnalysisController {

    @Autowired
    private AnalysisService analysisService;

    @GetMapping("/total-spending")
    public BigDecimal getTotalSpending() {
        return analysisService.calculateTotalSpending();
    }

    @GetMapping("/spending-by-category")
    public Map<String, BigDecimal> getSpendingByCategory() {
        return analysisService.calculateSpendingByCategory();
    }
}

