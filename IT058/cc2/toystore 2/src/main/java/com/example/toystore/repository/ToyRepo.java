package com.example.toystore.repository;







import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.toystore.model.Toy;
@Repository

public interface ToyRepo extends JpaRepository<Toy,Integer> {
   List<Toy> getToyBytoyBrand(String toyBrand);
   List<Toy>getToyBysuitableAge(int suitableAge);
   
}
 