/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_leonardi;

/**
 *
 * @author leona
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

public Personne (String Nom, String Prenom, int nbvoitures) {
    nom = Nom;
    prenom = Prenom;
    liste_voitures = new Voiture [3] ;
    nbvoitures = 0;
}
@Override
public String toString () {
    return ("Nom :" + nom + "Prenom :"+ prenom); 
}
}
