package com.example.toystore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.toystore.model.User;
import com.example.toystore.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/post/user")
    public User postMethodName(@RequestBody User s) {
        return userService.postData(s);
    }

    @GetMapping("/get/user")
    public List<User> getMethodName() {
        return userService.getData();
    }

    @GetMapping("get/user/{id}")
    public Optional<User> getMethodName(@PathVariable int id) {
        return userService.getById(id);
    }

    @GetMapping("/get/user/brand/{brand}")
    public List<User> getMethodName(@PathVariable String brand) {
        return userService.getByBrand(brand);
    }
    
    
    
    
}
