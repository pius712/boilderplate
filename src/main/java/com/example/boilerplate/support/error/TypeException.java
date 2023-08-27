package com.example.boilerplate.support.error;

public class TypeException extends RuntimeException{
    public TypeException(ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }
    public ExceptionType exceptionType;
}
