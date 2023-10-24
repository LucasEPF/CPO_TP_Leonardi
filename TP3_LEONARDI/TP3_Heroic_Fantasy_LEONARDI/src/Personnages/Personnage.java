/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author leona
 */
public abstract class Personnage {
    String nom;
    int NiveauDeVie;
    Arme Arme_actuelle = null;
    Arme Arme_en_Main; 
    
public Personnage (String Nom, int Niveaudevie, Arme ArmeActuelle) {
    Nom = nom;
    Niveaudevie = NiveauDeVie;
    ArmeActuelle = Arme_actuelle;
    
}
@Override
public String toString () {
    return ("Nom : " + nom + ", Niveau : "+ NiveauDeVie + "Arme actuelle : " + Arme_en_Main); 
}

ArrayList<Arme> Stuff = new ArrayList<Arme>();

public void Inventaire (Arme nouvelle_arme) {
    if (Stuff.size()<5) {
        Stuff.add(nouvelle_arme);
    }
}
public Arme getArme_en_Main() {
    return Arme_en_Main;
    }
public void Equiper_Arme (Arme nom) {
    for (int i = 0; i < Stuff.size(); i++) {
    if (Stuff.get(i)==nom ) {
        Arme_en_Main = Stuff.get(i);
        System.out.println("L'arme a été affectée");
    }   
}
}
    
}
