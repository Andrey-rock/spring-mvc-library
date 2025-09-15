package com.example.spring_mvc_library.exception;

public class NoSuchBookException extends RuntimeException {
    public NoSuchBookException() {
        super("No such book");
    }
}
