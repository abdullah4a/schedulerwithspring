package com.example.scheduler.services;

import com.example.scheduler.entities.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    User getById(long webId);
}
