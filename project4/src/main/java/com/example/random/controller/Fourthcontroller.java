package com.example.random.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project4.repository.Employee_repository;
import com.example.random.model.Employee_model;

@RestController
@RequestMapping("/api")
public class Fourthcontroller {
    @Autowired
    Employee_repository employee_repository;

    @PostMapping("/employee")

    public ResponseEntity<String> saveEmployee(@RequestBody List<Employee_model> empData){
        employee_repository.saveAll(empData);
        return ResponseEntity.ok("Data Saved");
    }
}