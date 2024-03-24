package com.example.financial_tracker.services;

import com.example.financial_tracker.entities.Account;
import com.example.financial_tracker.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServices {
    @Autowired
    AccountRepository repository;

    public List<Account> getAllAccounts() {
        return repository.findAll();
    }
}
