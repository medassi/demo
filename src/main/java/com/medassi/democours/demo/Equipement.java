package com.medassi.democours.demo;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table
@Inheritance (strategy = jakarta.persistence.InheritanceType.JOINED)
public abstract class Equipement {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    protected Long id;
    protected String nom;
    protected String numSerie;
    protected Double prix;
    @ManyToOne 
    @JoinColumn (name = "service")
    private Service serviceAffectation;

    public Long getId() {
        return id;
    } 

    public String getNom() {
        return nom;
    }

    public String getNumSerie() {
        return numSerie;
    }
    public Double getPrix() {
        return prix;
    }
    public Service getServiceAffectation() {
        return serviceAffectation;
    }

}