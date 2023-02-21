package com.vallegrande.crud.service;

import com.vallegrande.crud.model.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User create(User user);

    public User update(User user);

    public void delete(String id);
}
