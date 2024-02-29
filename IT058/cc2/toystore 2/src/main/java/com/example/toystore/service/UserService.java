package com.example.toystore.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toystore.model.User;
import com.example.toystore.repository.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepo userRepo;
    public User postData(User s)
    {
        return userRepo.save(s);
    }
    public List<User> getData()
    {
        return userRepo.findAll();
    }
    public Optional<User>getById(int id)
    {
        return userRepo.findById(id);
    }
    public List<User>getByBrand(String brand)
    {
        return userRepo.getByBrand(brand);
    }
}
