package com.example.financial_tracker.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "categoryId", insertable = false)
    private Integer id;
    @Column(name = "categoryName", nullable = false)
    private String name;

    // mapped to enum
    @Enumerated(EnumType.STRING)
    @Column(name = "categoryType")
    private CategoriesType type;
}
enum CategoriesType {
    INCOME,
    EXPENSE
}