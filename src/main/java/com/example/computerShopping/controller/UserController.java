package com.example.computerShopping.controller;

import com.example.computerShopping.model.User;

import com.example.computerShopping.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://your-frontend-domain.com")
public class UserController {
    private final UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}
