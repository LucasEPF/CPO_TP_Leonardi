/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leonardi_version_console;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Partie {
    int nbCoups=0;
    GrilleDeJeu grille;

public Partie() {
    grille = new GrilleDeJeu(7,7);
    }

public void initialiserPartie() {
    grille.melangerMatriceAleatoirement(4);
}
public void lancerPartie() {
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Bonjour, bienvenue dans LightOFF !");
   while (!grille.VerifToutesLesCellulesEteintes()) {
       
       System.out.println(grille);
       System.out.println("Choississez l'action à réaliser : \n 1) Ligne \n 2) Colonne \n 3) Diagonale Montante \n 4) Diagonale Descendante");
       int action = sc.nextInt();
       
       if (action ==1) {
           System.out.println("Quelle ligne voulez-vous activer ?");
           int ligne = sc.nextInt();
           grille.activerLigneDeCellules(ligne);

           
       } else if (action ==2) {
           System.out.println("Quelle colonne voulez-vous activer ?");
           int colonne = sc.nextInt();
           grille.activerColonneDeCellules(colonne);
        
           
       } else if (action ==3) {
           grille.activerDiagonaleMontante();
           
           
       } else {
           grille.activerDiagonaleDescendante();
        
       }
    nbCoups++;   
   }
    System.out.println("BRAVO! Vous avez éteint toutes les cellules en " + nbCoups + " coups."); 
    sc.close();
}
}

