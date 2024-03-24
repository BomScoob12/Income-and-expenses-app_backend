package com.example.financial_tracker.repositories;

import com.example.financial_tracker.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
