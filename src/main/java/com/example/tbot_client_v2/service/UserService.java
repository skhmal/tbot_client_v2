package com.example.tbot_client_v2.service;

import com.example.tbot_client_v2.entity.User;

import java.util.List;

public interface UserService {
    User getUserByUserName(String username);
    List<User> getAllUsers();
}
