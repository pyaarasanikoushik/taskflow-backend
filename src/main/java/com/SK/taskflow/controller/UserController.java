package com.SK.taskflow.controller;

import com.SK.taskflow.dto.UserRegistrationRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public String register(@RequestBody UserRegistrationRequest request) {

        return "Welcome " + request.getName();
    }
}