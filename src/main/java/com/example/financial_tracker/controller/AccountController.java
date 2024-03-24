package com.example.financial_tracker.controller;

import com.example.financial_tracker.entities.Account;
import com.example.financial_tracker.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    AccountServices services;

    @GetMapping("")
    public List<Account> getAllAccounts() {
        return services.getAllAccounts();
    }
}