package com.example.finance.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance.service.UserService;
import com.example.finance.entity.*;
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Appuser> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public Appuser createUser(@RequestBody Appuser user) {
        return userService.createUser(user);
    }
    
    // Additional endpoints like GET /{id}, PUT /{id}, DELETE /{id}
}

