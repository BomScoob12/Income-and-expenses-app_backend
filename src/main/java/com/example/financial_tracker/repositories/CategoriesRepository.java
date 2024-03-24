package com.example.financial_tracker.repositories;

import com.example.financial_tracker.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category, Integer> {
}
