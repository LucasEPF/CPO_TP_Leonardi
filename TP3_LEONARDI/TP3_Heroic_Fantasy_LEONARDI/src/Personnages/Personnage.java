/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author leona
 */
public abstract class Personnage {
    String nom;
    int NiveauDeVie;

public Personnage (String Nom, int Niveaudevie) {
    Nom = nom;
    Niveaudevie = NiveauDeVie;
    
}
@Override
public String toString () {
    return ("Nom : " + nom + ", Niveau : "+ NiveauDeVie); 
}

}