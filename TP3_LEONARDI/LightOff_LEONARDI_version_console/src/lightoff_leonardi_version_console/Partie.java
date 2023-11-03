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

public Partie(int NB_Lignes, int NB_Colonnes) {
    grille = new GrilleDeJeu(NB_Lignes,NB_Colonnes);
    }

public void initialiserPartie() {
    grille.melangerMatriceAleatoirement(4);
}
public void lancerPartie_Facile() {
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Vous avez choisi la difficulté facile. Vous avez accés aux lignes, aux colonnes et aux diagonales. Vous avez un nombre de coups illimité");
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

public void lancerPartie_Difficile() {
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Vous avez choisi le niveau difficile. Vous avez donc accés aux colonnes, aux lignes mais pas aux diagonales. Vous n'avez que 20 coups pour réussir!");
   while (!grille.VerifToutesLesCellulesEteintes()) {
       
       System.out.println(grille);
       System.out.println("Choississez l'action à réaliser : \n 1) Ligne \n 2) Colonne");
       int action = sc.nextInt();
       
       if (action ==1) {
           System.out.println("Quelle ligne voulez-vous activer ?");
           int ligne = sc.nextInt();
           grille.activerLigneDeCellules(ligne);

           
       } else if (action ==2) {
           System.out.println("Quelle colonne voulez-vous activer ?");
           int colonne = sc.nextInt(); 
       }
    nbCoups++;  
    if (nbCoups >= 20) {
        System.out.println("Vous avez échoué. Le nombre de coups maximale est de 20");
        break;
    }
   }
    System.out.println("BRAVO! Vous avez éteint toutes les cellules en " + nbCoups + " coups."); 
    sc.close();
}

public void lancerPartie_Moyenne() {
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Vous avez choisi le niveau moyenne. Vous avez donc accés aux colonnes, aux lignes et aux diagonales. Vous n'avez que 30 coups pour réussir!");
   while (!grille.VerifToutesLesCellulesEteintes()) {
       
       System.out.println(grille);
       System.out.println("Choississez l'action à réaliser : \n 1) Ligne \n 2) Colonne");
       int action = sc.nextInt();
       
       if (action ==1) {
           System.out.println("Quelle ligne voulez-vous activer ?");
           int ligne = sc.nextInt();
           grille.activerLigneDeCellules(ligne);

           
       } else if (action ==2) {
           System.out.println("Quelle colonne voulez-vous activer ?");
           int colonne = sc.nextInt(); 
       }
    nbCoups++;  
    if (nbCoups >= 30) {
        System.out.println("Vous avez échoué. Le nombre de coups maximale est de 30");
        break;
    }
   }
    System.out.println("BRAVO! Vous avez éteint toutes les cellules en " + nbCoups + " coups."); 
    sc.close();
}
}

    