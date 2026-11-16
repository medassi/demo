package com.medassi.democours.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;

@Entity
public class Ordinateur extends Equipement {
    private String processeur;
    private Integer ramGo;
    @Enumerated(jakarta.persistence.EnumType.STRING) 
    private TypePc typePc;

    public Ordinateur() {
    }

    public Ordinateur(String nom, String numSerie, Double prix,
            String processeur, Integer ramGo, TypePc typePc) {
        super.nom = nom;
        super.numSerie = numSerie;
        super.prix = prix;
        this.processeur = processeur;
        this.ramGo = ramGo;
        this.typePc = typePc;
    }

    public String getProcesseur() {
        return processeur;
    }
    public Integer getRamGo() {
        return ramGo;
    }
    public TypePc getTypePc() {
        return typePc;
    }
    

    @Override
    public String toString() {
        return "Ordinateur [id=" + super.id + ", nom=" + super.nom + ", numSerie=" + super.numSerie + ", prix="
                + super.prix
                + ", processeur=" + processeur + ", ramGo=" + ramGo + ", typePc=" + typePc + "]";
    }

}
