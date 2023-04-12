package com.fedyushkin.service.impl;

import com.fedyushkin.entity.User;
import com.fedyushkin.repository.UserRepository;
import com.fedyushkin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceJpa implements UserService, UserDetailsService {

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

    @Override
    public List<User> getAll(){
        return repository.findAll();
    }

    @Override
    public User getByLogin(String login){
        return repository.findByLogin(login);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User u = getByLogin(login);
        if (Objects.isNull(u)) {
            throw new UsernameNotFoundException(String.format("User %s is not found", login));
        }
        return new org.springframework.security.core.userdetails.User(u.getLogin(), u.getPassword(), true, true, true, true, new HashSet<>());
    }
}
