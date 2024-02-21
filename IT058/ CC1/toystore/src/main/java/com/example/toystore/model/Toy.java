package com.example.toystore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Toys")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int toyId;
    String toyBrand;
    String toyName;
    String toyDescription;
    int suitableAge;
    double toyPrice;
    public int getToyId() {
        return toyId;
    }
    public void setToyId(int toyId) {
        this.toyId = toyId;
    }
    public String getToyBrand() {
        return toyBrand;
    }
    public void setToyBrand(String toyBrand) {
        this.toyBrand = toyBrand;
    }
    public String getToyName() {
        return toyName;
    }
    public void setToyName(String toyName) {
        this.toyName = toyName;
    }
    public String getToyDescription() {
        return toyDescription;
    }
    public void setToyDescription(String toyDescription) {
        this.toyDescription = toyDescription;
    }
    public int getSuitableAge() {
        return suitableAge;
    }
    public void setSuitableAge(int suitableAge) {
        this.suitableAge = suitableAge;
    }
    public double getToyPrice() {
        return toyPrice;
    }
    public void setToyPrice(double toyPrice) {
        this.toyPrice = toyPrice;
    }
    
    
}
