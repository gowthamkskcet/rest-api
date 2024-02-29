package com.example.toystore.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.toystore.model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    
    @Query(value = "select * from users a join toys b on a.userid=b.user where b.toy_brand=?1",nativeQuery = true)
    List<User>getByBrand(String brand);
}
