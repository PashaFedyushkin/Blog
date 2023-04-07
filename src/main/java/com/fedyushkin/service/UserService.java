package com.fedyushkin.service;

import com.fedyushkin.entity.User;

public interface UserService {

    public long addUser(User user);

    public void deleteUser(long id);
}
