package com.example.toystore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toystore.model.Toy;
import com.example.toystore.model.User;
import com.example.toystore.repository.ToyRepo;
import com.example.toystore.repository.UserRepo;

@Service
public class ToyService {
    @Autowired
    ToyRepo toyRepo;
    @Autowired
    UserRepo userRepo;
    public Toy addToyData(Toy T)
    {
        return toyRepo.save(T);
    }
    public List<Toy> getToyData()
    {
        return toyRepo.findAll();
    }
    public Optional<Toy> getToyDataById(int id)
    {
        return toyRepo.findById(id);
    }
    //put
    public Toy editToyData(int id,Toy T)
    {
        Toy toyValid=toyRepo.findById(id).orElse(null);
        if(toyValid!=null)
        {
            toyValid.setToyBrand(T.getToyBrand());
            toyValid.setToyName(T.getToyName());
            toyValid.setToyDescription(T.getToyDescription());
            toyValid.setSuitableAge(T.getSuitableAge());
            toyValid.setToyPrice(T.getToyPrice());
            return toyRepo.saveAndFlush(toyValid);
        }
        else
        return null;
    }
    //delete
    public String DeleteToyDataById(int id)
    {
        toyRepo.deleteById(id);
        return("Toy Data Removed Succesfully");
    }
    //public List<Toy> getToyBrand(String toyBrand)
    //{
    //   return toyRepo.getToyByBrand(toyBrand);
    //}




    //userr
    public User addUserData(User s)
    {
        return userRepo.save(s);
    }
    public List<User> getUserData()
    {
        return userRepo.findAll();
    }
    public Optional<User> getUserDataById(int id)
    {
        return userRepo.findById(id);
    }

   
}
