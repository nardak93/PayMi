package com.example.PayMe.service;


import com.example.PayMe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.PayMe.repository.UserRepository;

@Service
public class DarkadminService {
    @Autowired
    UserRepository userRepository;

    public User getUserByName(String userName) {
        return userRepository.getUserByName(userName);
    }
}
