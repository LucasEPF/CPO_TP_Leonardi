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
        for (int i=0; i<nbLignes; i++) {
            for (int j=0; j<nbColonnes;j++) {
               matricesCellules [i][j] = new CelluleLumineuse();
               
            }
            
        }
    }
public void eteindreToutesLesCellules() {
        for (int i=0; i<nbLignes; i++) {
            for (int j=0; j<nbColonnes;j++) {
               matricesCellules [i][j].eteindreCellule();
            }              
    }
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
    int randomNumber = random.nextInt(3);
    int min = Math.min(matricesCellules.length, matricesCellules[0].length);
    
    if (randomNumber == 0) {
        int Aléa = random.nextInt(matricesCellules.length);
        for (int i=0; i<matricesCellules.length; i++) {
        matricesCellules [Aléa][i].activerCellule();
        }
    } else if (randomNumber == 1) {
        int Aléa = random.nextInt(matricesCellules.length);
        for (int j=0; j<matricesCellules.length; j++) {
        matricesCellules [j][Aléa].activerCellule();
        }   
    } else if (randomNumber == 2) {
        int DiagMAléa = random.nextInt(matricesCellules.length);
        for (int w=0; w<DiagMAléa; w++) {
            matricesCellules [w][w].activerCellule();
        }
    } else if (randomNumber == 3) {
        int DiagDAléa = random.nextInt (matricesCellules.length);
        for (int z=0; z<DiagDAléa; z++) {
            matricesCellules [z][DiagDAléa-1-z].activerCellule();
        }
    }   
}
public void melangerMatriceAleatoirement(int nbTours) {
    
    eteindreToutesLesCellules();
    for (int i=0; i<nbTours; i++) {
        activerLigneColonneOuDiagonaleAleatoire();
    }
}
}

