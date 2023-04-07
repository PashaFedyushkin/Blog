package com.fedyushkin.service.impl;

import com.fedyushkin.entity.User;
import com.fedyushkin.repository.UserRepository;
import com.fedyushkin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceJpa implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public long addUser(User user){
        return repository.save(user).getId();
    }

    @Override
    public void deleteUser(long id) {
        repository.deleteById(id);
    }
}
