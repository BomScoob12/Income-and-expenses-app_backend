package com.example.financial_tracker.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @Column(name = "userId", nullable = false, length = 8)
    private Integer id;
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Column(name = "email", unique = true, length = 100)
    private String email;
    @Column(name = "hashedPassword", nullable = false, length = 100)
    private String hashedPassword;

    @JsonIgnore
    @OneToMany(mappedBy = "linkedUser", fetch = FetchType.EAGER)
    private Set<Account> accounts;
}
