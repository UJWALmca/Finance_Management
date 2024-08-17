package com.example.finance.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finance.entity.*;
import com.example.finance.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Appuser> getAllUsers() {
        return userRepository.findAll();
    }

    public Appuser createUser(Appuser user) {
        // You may add validation and password hashing here
        return userRepository.save(user);
    }

    public Optional<Appuser> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    // Additional methods for updating and deleting users
}
