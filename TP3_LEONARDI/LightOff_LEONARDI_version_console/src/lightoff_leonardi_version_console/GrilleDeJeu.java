/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leonardi_version_console;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

/**
 *
 * @author leona
 */
public class GrilleDeJeu {
   
   int nbLignes;
   int nbColonnes;
   CelluleLumineuse [][] matricesCellules;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matricesCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i=0; i<nbLignes; i++) {
            for (int j=0; j<nbColonnes;j++) {
               matricesCellules [i][j] = new CelluleLumineuse();
               
            }
            
        }
    }
public boolean eteindreToutesLesCellules() {
   boolean toutesLesCellulesEteintes = false;
    for (int ligne = 0; ligne < nbLignes; ligne++) {
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            matricesCellules[ligne][colonne].eteindreCellule();
        }
    }

    // Vérifiez si toutes les cellules sont éteintes
    for (int ligne = 0; ligne < nbLignes; ligne++) {
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            if (matricesCellules[ligne][colonne].getEtat()) {
                toutesLesCellulesEteintes = true;
                break; // Si une cellule n'est pas éteinte, sortez de la boucle
            }
        }
    }

    return toutesLesCellulesEteintes;
}
public void activerLigneDeCellules(int idLigne) {
    for (int i=0; i<matricesCellules.length; i++) {
    matricesCellules [idLigne][i].activerCellule();
} 
}
public void activerColonneDeCellules(int idColonne) {
    for (int j=0; j<matricesCellules.length; j++) {
    matricesCellules [j][idColonne].activerCellule();
}  
}    
public void activerDiagonaleDescendante() {
    int min = Math.min(nbLignes, nbColonnes);
    for (int i=0; i<min; i++) {
            matricesCellules [i][i].activerCellule();  
}
}
public void activerDiagonaleMontante() {
    int min = Math.min(nbLignes, nbColonnes);
    for (int i=0; i<min; i++) {
            matricesCellules [i][nbColonnes-1-i].activerCellule();
}
}
public void activerLigneColonneOuDiagonaleAleatoire() {
    Random random = new Random();
    int randomNumber = random.nextInt(4);

       switch (randomNumber) {
           case 0 ->                {
                   int Aléa = random.nextInt(nbLignes);
                   for (int i=0; i<nbColonnes; i++) {
                       matricesCellules [Aléa][i].activerCellule();
                   }                        }
           case 1 ->                {
                   int Aléa = random.nextInt(nbColonnes);
                   for (int j=0; j<nbLignes; j++) {
                       matricesCellules [j][Aléa].activerCellule();
                   }                        }
           case 2 -> {
               for (int w=0; w<Math.min(nbLignes, nbColonnes); w++) {
                   matricesCellules [w][w].activerCellule();
               }
           }
           case 3 -> {
               for (int z=0; z<Math.min(nbLignes,nbColonnes); z++) {
                   matricesCellules [z][nbColonnes-1-z].activerCellule();
               }
           }
           default -> {
           }
       }
}
public void melangerMatriceAleatoirement(int nbTours) {
    
    eteindreToutesLesCellules();
    for (int i=0; i<nbTours; i++) {
        activerLigneColonneOuDiagonaleAleatoire();
    }
}
@Override
public String toString() {
    String grilleDeJeu = "";
    grilleDeJeu += "   | ";
    
    for (int j = 0; j < nbColonnes; j++) {
        grilleDeJeu = grilleDeJeu + "" + j + " | ";
    }
    grilleDeJeu = grilleDeJeu + "\n";
    for (int j= 0; j <(nbColonnes+1); j++) {
        grilleDeJeu +="----";     
}
    grilleDeJeu = grilleDeJeu + "\n";
    
    for (int i=0; i<nbLignes; i++) {
        grilleDeJeu += " " + i + " | ";
        for (int j=0; j <nbColonnes; j++) {
            grilleDeJeu+= "" + matricesCellules [i][j] + " | ";
        }
        grilleDeJeu = grilleDeJeu + "\n";
        
        for (int j=0; j<(nbColonnes+1); j++) {
            grilleDeJeu += "----";
        }
        grilleDeJeu += "\n";
    }
    return grilleDeJeu;
}
}

