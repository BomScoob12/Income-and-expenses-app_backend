package com.example.financial_tracker.controller;

import com.example.financial_tracker.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    CategoryServices services;

    @GetMapping("")
    public ResponseEntity<Object> getAllCategories() {
        return ResponseEntity.ok().body(services.getAllCategories());
    }
}
