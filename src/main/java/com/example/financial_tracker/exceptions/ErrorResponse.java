package com.example.financial_tracker.exceptions;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@RequiredArgsConstructor
public class ErrorResponse {
    // this is class for response Error Object.
    private final String title;
    private final int statusCode;
    private final String message;
    private final String instance;
    private List<ValidationError> validationErrorList;

    // this class for validate field error
    @Data
    @RequiredArgsConstructor
    private static class ValidationError {
        private final String field;
        private final String message;
    }

    // adding validation error list for response error.
    public void addValidationError (String field, String message) {
        if (Objects.isNull(validationErrorList)) this.validationErrorList = new ArrayList<>();
        this.validationErrorList.add(new ValidationError(field, message));
    }
}
