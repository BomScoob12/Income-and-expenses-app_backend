package com.example.financial_tracker.controller;

import com.example.financial_tracker.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserServices services;

    @GetMapping("")
    public ResponseEntity<Object> getAllUsers() {
        System.out.println(services.getAllUsers());
        return ResponseEntity.ok(services.getAllUsers());
    }
}
