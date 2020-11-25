package com.learn.testspring.controller;

import com.learn.testspring.dao.UserWhitelistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserWhitelistRepository repository;
    @GetMapping("/getAllUsers")
    public String getAllUsers() {
        repository.findAll();
        return "hello";
    }

}