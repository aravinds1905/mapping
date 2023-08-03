package com.example.project4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.random.model.Employee_model;

public interface Employee_repository extends JpaRepository<Employee_model, Long> {
    
}
