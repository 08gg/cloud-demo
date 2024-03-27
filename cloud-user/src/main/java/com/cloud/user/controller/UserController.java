package com.cloud.user.controller;

import com.cloud.user.pojo.User;
import com.cloud.user.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServer userServer;

    @GetMapping("/{id}")
    public User find(@PathVariable Integer id){
        return userServer.find(id);
    }
}
