package com.example.financial_tracker.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "transactions")
public class Transaction {
    @Id
    @Column(name = "transactionId", insertable = false)
    private Integer id;
    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;
    @Column(name = "transactionTitle")
    private String title;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "accountId", referencedColumnName = "accountId")
    private Account account;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    private Category category;
}
