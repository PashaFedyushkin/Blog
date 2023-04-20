package com.fedyushkin.service;

import com.fedyushkin.entity.User;

import java.util.List;

public interface UserService {

    public long addUser(User user);

    public void deleteUser(long id);

    public List<User> getAll();

    public User getByUsername(String login);
}
