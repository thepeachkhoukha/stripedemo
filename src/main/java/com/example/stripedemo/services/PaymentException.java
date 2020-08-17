package com.example.stripedemo.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class PaymentException extends RuntimeException{
    public PaymentException(final String message) {
        super(message);
    }
}
