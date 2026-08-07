package com.SK.taskflow.service.impl;

import com.SK.taskflow.dto.UserRegistrationRequest;
import com.SK.taskflow.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String registerUser(UserRegistrationRequest request) {

        return "Welcome " + request.getName();

    }
}