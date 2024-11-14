package com.da.leaning_spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.da.leaning_spring_boot.entity.User;
import com.da.leaning_spring_boot.request.CreateUser;
import com.da.leaning_spring_boot.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> list() {
        return userRepository.findAll();
    }

    public User saveUser(CreateUser request) {

        if(userRepository.existsByUsername(request.getUsername())){
        }
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        return userRepository.save(user);
    }

    public User getUser(String id) {
        return userRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
