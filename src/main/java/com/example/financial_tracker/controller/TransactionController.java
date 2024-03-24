package com.example.financial_tracker.controller;

import com.example.financial_tracker.services.TransactionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    TransactionServices services;

    @GetMapping("")
    public ResponseEntity<Object> getAllTransaction() {
        return ResponseEntity.ok().body(services.getAllTransactions());
    }
}
