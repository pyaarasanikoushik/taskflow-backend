package com.SK.taskflow.service;

import com.SK.taskflow.dto.UserRegistrationRequest;

public interface UserService {

    String registerUser(UserRegistrationRequest request);

}