package com.example.Custom.Exception.Service;

import com.example.Custom.Exception.Exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserById(Long id) {

        if (id != 1) {
            throw new UserNotFoundException("User not found with id: " + id);
        }

        return "John Doe";
    }
}
