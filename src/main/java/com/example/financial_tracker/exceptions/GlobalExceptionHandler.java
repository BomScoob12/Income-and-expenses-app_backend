package com.example.financial_tracker.exceptions;

import com.example.financial_tracker.controller.AccountController;
import com.example.financial_tracker.controller.UserController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice(assignableTypes = {UserController.class, AccountController.class})
public class GlobalExceptionHandler {

    public static ResponseEntity<ErrorResponse> buildErrorResponse(String title, HttpStatus statusCode, Exception exception, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(title, statusCode.value(), exception.getMessage(), request.getDescription(false));
        return ResponseEntity.status(statusCode).body(errorResponse);
    }

    @ExceptionHandler(ItemNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleItemNotFoundException(ItemNotFoundException exception, WebRequest request) {
        // not implement Request yet
        return buildErrorResponse("Item not found!!!", HttpStatus.NOT_FOUND, exception, request);
    }

    @ExceptionHandler (DuplicateItemException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleDuplicateItemException(DuplicateItemException exception, WebRequest request) {
        return buildErrorResponse("Duplicate items.", HttpStatus.BAD_REQUEST, exception, request);
    }

    // handle all error occurred
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponse> handleOtherUncaughtException(Exception exception, WebRequest request) {
        System.out.println(request.getDescription(true));
        return buildErrorResponse("Unknown Error occurred.", HttpStatus.INTERNAL_SERVER_ERROR, exception, request);
    }
}
