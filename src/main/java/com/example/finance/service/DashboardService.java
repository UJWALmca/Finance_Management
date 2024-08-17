package com.example.finance.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    private UserService userService;
    
    @Autowired
    private AnalysisService analysisService;

    public Map<String, Object> getDashboardData() {
        Map<String, Object> data = new HashMap<>();
        data.put("totalUsers", userService.getAllUsers().size());
        data.put("totalSpending", analysisService.calculateTotalSpending());
        data.put("spendingByCategory", analysisService.calculateSpendingByCategory());
        return data;
    }
}