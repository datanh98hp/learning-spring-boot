package com.da.leaning_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.da.leaning_spring_boot.entity.User;
import com.da.leaning_spring_boot.request.CreateUser;
import com.da.leaning_spring_boot.request.UserUpdate;
import com.da.leaning_spring_boot.response.ApiResponse;
import com.da.leaning_spring_boot.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired 
    private UserService userService;
    @GetMapping
    public ApiResponse<List<User>>  list() {
        ApiResponse<List<User>> response = new ApiResponse<>();
        response.setCode(200);
        response.setResult(userService.list());
        return response;
    }
    @PostMapping
    public ApiResponse<User> create(@RequestBody @Valid CreateUser user) {
        ApiResponse<User> response = new ApiResponse<>();
        response.setCode(200); 
        response.setResult(userService.saveUser(user));
        return response;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String id) {
    
        return userService.getUser(id);
    }
    @PutMapping("/{id}")
    public User update(@PathVariable("id") String id,@RequestBody UserUpdate userUpdate) {
        return null;
    }
    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable("id") String id) {
    
        return null;
    }
}