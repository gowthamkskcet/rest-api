package com.example.toystore.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.toystore.model.Toy;
import com.example.toystore.model.User;
import com.example.toystore.service.ToyService;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;









@RestController
public class ToyController {
    @Autowired
    ToyService toyService;
    @PostMapping("/posttoy")
    public ResponseEntity<Toy> postMethodName(@RequestBody Toy T) {
        return new ResponseEntity<>(toyService.addToyData(T),HttpStatus.CREATED);
    }
   
    
    @GetMapping("/gettoy")
    public List<Toy> getMethodName() {
        return toyService.getToyData();
    }
   @GetMapping("/gettoy/{toyBrand}")
   public List<Toy> getvale(@PathVariable String toyBrand) {
       return toyService.getToyBytoyBrand(toyBrand);
   }
   @GetMapping("/getage/{suitableAge}")
   public List<Toy> getAge(@PathVariable int suitableAge) {
       return toyService.getToyBysuitableAge(suitableAge);
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

    @GetMapping("/sort/{field}")
    public List<Toy> getMethodName(@PathVariable String field) {
        return toyService.SortToys(field);
    }

    @GetMapping("/page/{pageNo}/{pageSize}")
    public List<Toy> getMethodName(@PathVariable int pageNo,@PathVariable int pageSize) {
        return toyService.PageToys(pageNo,pageSize);
    }

    @GetMapping("/pagesort/{pageNo}/{pageSize}/{field}")
    public List<Toy> getMethodName(@PathVariable int pageNo,@PathVariable int pageSize,@PathVariable String field) {
        return toyService.PageandSort(pageNo,pageSize,field);
    }

    
    
    
    


    
    
    
}
