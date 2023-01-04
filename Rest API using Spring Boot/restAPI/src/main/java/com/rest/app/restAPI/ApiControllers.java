package com.rest.app.restAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome :) How are you today? ";
    }

    @GetMapping(value = "/")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(User user) {
        userRepo.save(user);
        return "saved";
    }

}

