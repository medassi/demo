package com.medassi.democours.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
public class Imprimante extends Equipement {
    private Boolean estCouleur;

    public Boolean isCouleur() {
        return estCouleur;
    }
}