/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leonardi_version_console;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;

/**
 *
 * @author leona
 */
public class GrilleDeJeu {
   
   int nbLignes;
   int nbColonnes;
   CelluleLumineuse [][] matricesCellules;
   int nombreAleatoire = random.nextInt(4) + 1;

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
    matricesCellules [idLigne][0].activerCellule();
} 
public void activerColonneDeCellules(int idColonne) {
    matricesCellules [0][idColonne].activerCellule();
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
    
}
}

