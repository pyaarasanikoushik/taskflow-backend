package com.SK.taskflow.controller;

import com.SK.taskflow.dto.UserRegistrationRequest;
import com.SK.taskflow.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRegistrationRequest request) {

        return userService.registerUser(request);

    }
}