package com.example.finance.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finance.entity.*;

public interface UserRepository extends JpaRepository<Appuser, Long> {
    Optional<Appuser> findByUsername(String username);
}
