package com.example.toystore.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.toystore.model.Toy;
import com.example.toystore.model.User;
import com.example.toystore.service.ToyService;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;






@RestController
public class ToyController {
    @Autowired
    ToyService toyService;
    @PostMapping("/posttoy")
    public Toy postMethodName(@RequestBody Toy T) {
        return toyService.addToyData(T);
    }
    @PostMapping("/postuser")
    public User postMethodNameUser(@RequestBody User u) {
        
        return toyService.addUserData(u);
    }
    
    @GetMapping("/gettoy")
    public List<Toy> getMethodName() {
        return toyService.getToyData();
    }
    //@GetMapping("/gettoy/{toyBrand}")
    //public List<Toy> getMethodNameBrand(@PathVariable String toyBrand) {
    //    return toyService.getToyBrand(toyBrand);
    //}
    
    @GetMapping("/getuser")
    public List<User> getMethodUser() {
        return toyService.getUserData();
    }
    @GetMapping("/getuser/{id}")
    public Optional<User> getMethodNameUser(@PathVariable int id) {
        return toyService.getUserDataById(id);
    }
    
    
    @GetMapping("/getidtoy/{id}")
    public Optional<Toy> getMethodName(@PathVariable int id) {
        return toyService.getToyDataById(id);
    }
    @PutMapping("updatetoy/{id}")
    public Toy putMethodName(@PathVariable int id, @RequestBody Toy T) {
        return toyService.editToyData(id,T);
    }
    @DeleteMapping("deltoy/{id}")
    public String detMethodName(@PathVariable int id)
    {
        return toyService.DeleteToyDataById(id);
    }
    
    


    
    
    
}
