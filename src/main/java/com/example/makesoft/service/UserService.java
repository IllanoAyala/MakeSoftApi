package com.example.makesoft.service;

import com.example.makesoft.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
}


