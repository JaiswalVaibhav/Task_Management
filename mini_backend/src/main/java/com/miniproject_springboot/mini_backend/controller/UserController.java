package com.miniproject_springboot.mini_backend.controller;

import com.miniproject_springboot.mini_backend.model.Login;
import com.miniproject_springboot.mini_backend.model.User;
import com.miniproject_springboot.mini_backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "You are registered...";
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @PostMapping("/login")
    public User findByEmailPassword(@RequestBody Login login){
        User u = userRepo.findByEmailAndPassword(login.getEmail(), login.getPassword());
        User x = null;
        if (u==null){
            return x;
        }
        return u;
    }
}


