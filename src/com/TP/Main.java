package com.TP;
import static javax.swing.JOptionPane.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        showMessageDialog(null,"Welcome to Hogwarts School of Witchcraft and Wizardry!");
        System.out.println("Comment vous vous appellez ?");
        String nom = sc.nextLine();
        String sexe ;
        System.out.println("Etes vous \nUn sorcier (tapez 1) \nUne sorcière (tapez 2)");
        if (sc1.nextInt()==1){
            sexe = "Sorcier";

        }else {
            sexe = "Sorcière";
        }
        System.out.println("Veuillez saisir le nom de votre baguette magique");
        String nomBaguette = sc.nextLine();
        System.out.println("De quel bois ?");
        String boisBaguette =sc.nextLine();
        BaguetteMagique baguette = new BaguetteMagique(nomBaguette,boisBaguette);
        String caracteristiques ="Patient,Sincere,Tolerant,Courageux,Fort,Bravoure,Curieux,Creatif,Original,Rusé,Provocateur,Ambitieux";
        String[] caracteristique = caracteristiques.split(",");
        Maison maison = new Maison();
        Sorcier sorcier = new Sorcier(nom,sexe,baguette,0,0,0,0,null,maison);
        for (int i=0;i<(caracteristique.length/4);i++){
            System.out.println("Etes vous "+caracteristique[i]+" ? (Repondez par O/N");
            if (sc.nextLine().equals("O")){
                sorcier.ressemblancePouffsoufle=(sorcier.ressemblancePouffsoufle+1);
            }}
        for (int i=(caracteristique.length/4);i<(caracteristique.length/2);i++){
            System.out.println("Etes vous "+caracteristique[i]+" ? (Repondez par O/N");
            if (sc.nextLine().equals("O")){
            sorcier.ressemblanceGryffondor=sorcier.ressemblanceGryffondor+1;
        }}
        for (int i=(caracteristique.length/2);i<(3*caracteristique.length/4);i++){
            System.out.println("Etes vous "+caracteristique[i]+" ? (Repondez par O/N");
            if (sc.nextLine().equals("O")){
            sorcier.ressemblanceSerdaigle=sorcier.ressemblanceSerdaigle+1;
        }}
        for (int i=(3*caracteristique.length/4);i<(caracteristique.length);i++){
            System.out.println("Etes vous "+caracteristique[i]+" ? (Repondez par O/N");
            if (sc.nextLine().equals("O")){
            sorcier.ressemblanceSerpentard=sorcier.ressemblanceSerpentard+1;
        }}
        sorcier.setMaisonFinal(sorcier.maison.maison(sorcier));
        System.out.println("Le nom du "+sorcier.getSexe()+" est "+sorcier.getNom()+" propriétaire de la "+sorcier.getBaguette().getNom()+" fabriqué du "+sorcier.getBaguette().getBois()
                +" et t'es choisi de faire partie de la maison "+sorcier.getMaisonFinal());



    }

    }
