package com.TP;

public class Sorcier {
    String nom;
    String sexe;
    BaguetteMagique baguette;
    int ressemblancePouffsoufle;
    int ressemblanceGryffondor;
    int ressemblanceSerdaigle;
    int ressemblanceSerpentard;
    String maisonFinal;
    Maison maison;

    public Sorcier(String nom, String sexe, BaguetteMagique baguette, int ressemblancePouffsoufle, int ressemblanceGryffondor, int ressemblanceSerdaigle, int ressemblanceSerpentard, String maisonFinal,Maison maison) {
        this.nom = nom;
        this.sexe = sexe;
        this.baguette = baguette;
        this.ressemblancePouffsoufle = ressemblancePouffsoufle;
        this.ressemblanceGryffondor = ressemblanceGryffondor;
        this.ressemblanceSerdaigle = ressemblanceSerdaigle;
        this.ressemblanceSerpentard = ressemblanceSerpentard;
        this.maison = maison;
        this.maisonFinal =maisonFinal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public BaguetteMagique getBaguette() {
        return baguette;
    }

    public void setBaguette(BaguetteMagique baguette) {
        this.baguette = baguette;
    }

    public int getRessemblancePouffsoufle() {
        return ressemblancePouffsoufle;
    }

    public void setRessemblancePouffsoufle(int ressemblancePouffsoufle) {
        this.ressemblancePouffsoufle = ressemblancePouffsoufle;
    }

    public int getRessemblanceGryffondor() {
        return ressemblanceGryffondor;
    }

    public void setRessemblanceGryffondor(int ressemblanceGryffondor) {
        this.ressemblanceGryffondor = ressemblanceGryffondor;
    }

    public int getRessemblanceSerdaigle() {
        return ressemblanceSerdaigle;
    }

    public void setRessemblanceSerdaigle(int ressemblanceSerdaigle) {
        this.ressemblanceSerdaigle = ressemblanceSerdaigle;
    }

    public int getRessemblanceSerpentard() {
        return ressemblanceSerpentard;
    }

    public void setRessemblanceSerpentard(int ressemblanceSerpentard) {
        this.ressemblanceSerpentard = ressemblanceSerpentard;
    }

    public void setMaisonFinal(String maisonFinal) {
        this.maisonFinal = maisonFinal;
    }

    public String getMaisonFinal() {
        return maisonFinal;
    }

    public Maison getMaison() {
        return maison;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }
}