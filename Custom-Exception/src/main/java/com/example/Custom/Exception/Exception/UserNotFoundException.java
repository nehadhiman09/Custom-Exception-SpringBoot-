package com.example.Custom.Exception.Exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message)
    {
        super(message);
    }
}
