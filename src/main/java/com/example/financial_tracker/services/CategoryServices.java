package com.example.financial_tracker.services;

import com.example.financial_tracker.entities.Category;
import com.example.financial_tracker.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {
    @Autowired
    CategoriesRepository repository;

    public List<Category> getAllCategories() {
        return repository.findAll();
    }
}
