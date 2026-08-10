package com.SK.taskflow.service.impl;

import com.SK.taskflow.dto.UserRegistrationRequest;
import com.SK.taskflow.entity.User;
import com.SK.taskflow.repository.UserRepository;
import com.SK.taskflow.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String registerUser(UserRegistrationRequest request) {

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();

        userRepository.save(user);

        return "Welcome " + user.getName();
    }
}