package org.example.test.service;

import org.example.test.entity.User;

import java.util.List;

public interface UserService {

    public boolean register(User user);

    public List<User> query();
}
