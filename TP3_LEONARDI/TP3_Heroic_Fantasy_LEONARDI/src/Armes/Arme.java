/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author leona
 */
public abstract class Arme {
    private String nom;
    int niveau;

public String getNom () {
    return nom;
}

public Arme (String Nom, int Niveau) {
    nom = Nom;
    niveau = Niveau;
    if (niveau>100) {
        System.out.println("Le niveau maximal est de 100");
        niveau = 100;
    }
}
@Override
public String toString () {
    return ("Nom : " + nom + ", Niveau : "+ niveau); 
}       
    
}
