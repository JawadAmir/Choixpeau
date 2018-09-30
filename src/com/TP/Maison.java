package com.TP;
public class Maison{

    public String maison (Sorcier sorcier){
        int ressemblance[] = {sorcier.getRessemblancePouffsoufle(),sorcier.getRessemblanceGryffondor(), sorcier.getRessemblanceSerdaigle(),sorcier.getRessemblanceSerpentard()};
        int ressemblanceMaison = ressemblance[0];
        //Calcul le max ressemblance
        for (int i = 1; i < 4; i++) {
            if (ressemblance[i] > ressemblanceMaison) {
                ressemblanceMaison = ressemblance[i];
            }}
            String cettemaison;
         // Choisir la bonne maison
            if (ressemblance[0] == ressemblanceMaison) {
                cettemaison ="Poufsouffle";
            } else if (ressemblance[1] == ressemblanceMaison) {
                cettemaison ="Gryffondor";
            } else {
                if (ressemblance[2] == ressemblanceMaison) {
                    cettemaison = "Serdaigle";
                } else {
                    cettemaison = "Serpentard";
                }
            }
            return cettemaison;
        } }