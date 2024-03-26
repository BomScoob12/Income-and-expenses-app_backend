package com.example.financial_tracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class DuplicateItemException extends ResponseStatusException {
    public DuplicateItemException(String msg) {
        super(HttpStatus.BAD_REQUEST, msg);
    }
}
