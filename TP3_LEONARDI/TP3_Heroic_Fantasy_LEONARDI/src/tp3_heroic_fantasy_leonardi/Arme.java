/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_leonardi;

/**
 *
 * @author leona
 */
public abstract class Arme {
    String nom;
    int niveau;

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
    return ("Nom :" + nom + "Niveau :"+ niveau); 
}       
    
}
