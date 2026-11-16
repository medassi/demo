package com.medassi.democours.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table 
public class Service{
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom ;
    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

}