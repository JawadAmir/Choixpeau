package com.TP;

public class BaguetteMagique {
    private String nom;
    private String bois;
    public BaguetteMagique(String nom, String bois) {
        this.nom = nom;
        this.bois = bois;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBois() {
        return bois;
    }

    public void setBois(String bois) {
        this.bois = bois;
    }
}
