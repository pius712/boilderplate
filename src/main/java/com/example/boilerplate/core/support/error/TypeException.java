package com.example.boilerplate.core.support.error;

public class TypeException extends RuntimeException {
    public TypeException(ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    public ExceptionType exceptionType;
}
