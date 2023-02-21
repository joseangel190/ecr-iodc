package com.vallegrande.crud.service.impl;

import com.vallegrande.crud.model.User;
import com.vallegrande.crud.repository.UserRepository;
import com.vallegrande.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }
}
