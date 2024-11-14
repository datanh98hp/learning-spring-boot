package com.da.leaning_spring_boot.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

;
public class CreateUser {
    @Size(min = 3, message = "Username should be at least 3 characters")
    private String username;
    @Size(min = 6, message = "Password should be at least 6 characters")
    private String password;
    @Email
    private String email;
    public CreateUser(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public CreateUser() {
    }
}