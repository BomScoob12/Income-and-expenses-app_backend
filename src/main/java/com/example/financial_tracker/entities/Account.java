package com.example.financial_tracker.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "accounts")
public class Account {
    @Id
    @Column(name = "accountId", nullable = false, length = 12)
    private String id;
    @Column(name = "accountName", nullable = false)
    private String name;
    @Column(name = "accountDesc", nullable = false)
    private String description;
    private BigDecimal balance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ownerId")
    private User linkedUser;
}
