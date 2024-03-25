package com.example.financial_tracker.services;

import com.example.financial_tracker.entities.Account;
import com.example.financial_tracker.entities.User;
import com.example.financial_tracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Set;

@Service
public class UserServices {
    @Autowired
    UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Set<Account> getUserAccounts(int userId) {
        User user = repository.findById(userId).orElseThrow(() -> new HttpClientErrorException(HttpStatus.BAD_REQUEST, ("user Id " + userId + " does not exist.")));
        return user.getAccounts();
    }
}
