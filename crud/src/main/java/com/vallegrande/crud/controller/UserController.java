package com.vallegrande.crud.controller;

import com.vallegrande.crud.model.User;
import com.vallegrande.crud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        log.info("view Users");
        return userService.findAll();
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        log.info("user created successfully");
        return userService.create(user);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user){
        log.info("User successfully updated");
        return userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        log.info("User successfully removed");
        userService.delete(id);
    }
}
