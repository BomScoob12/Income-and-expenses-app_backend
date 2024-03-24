package com.example.financial_tracker.repositories;

import com.example.financial_tracker.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
