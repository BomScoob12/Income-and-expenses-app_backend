package com.example.financial_tracker.services;

import com.example.financial_tracker.entities.Transaction;
import com.example.financial_tracker.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServices {
    @Autowired
    TransactionRepository repository;

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }
}
