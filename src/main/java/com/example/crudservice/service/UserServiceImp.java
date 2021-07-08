package com.example.crudservice.service;

import com.example.crudservice.model.User;
import com.example.crudservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
