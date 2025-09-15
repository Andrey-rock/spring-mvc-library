package com.example.spring_mvc_library.controller;

import com.example.spring_mvc_library.dto.BookError;
import com.example.spring_mvc_library.exception.NoSuchBookException;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Hidden
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NoSuchBookException.class)
    public ResponseEntity<BookError> handleUserNoSuchException(@NotNull NoSuchBookException e) {
        BookError bankError = new BookError("404", e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(bankError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<BookError> handleMethodArgumentNotValidException(@NotNull MethodArgumentNotValidException e) {
        BookError bankError = new BookError("400", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bankError);
    }
}
