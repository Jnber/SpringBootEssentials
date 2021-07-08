package com.example.crudservice.service;

import com.example.crudservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();
}
