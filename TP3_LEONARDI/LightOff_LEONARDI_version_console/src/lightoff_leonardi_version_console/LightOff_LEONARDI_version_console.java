/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_leonardi_version_console;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class LightOff_LEONARDI_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc = new Scanner(System.in);
System.out.println("Bonjour, quel niveau de difficulté voulez-vous ? : \n 1) Facile \n 2) Moyen \n 3) Difficile");
int Difficulté = sc.nextInt();

if (Difficulté == 1) {
    Partie NouvellePartie = new Partie(5,5);
    NouvellePartie.initialiserPartie();
    NouvellePartie.lancerPartie_Facile();
    
} else if (Difficulté == 2) {
    Partie NouvellePartie = new Partie(7,7);
    NouvellePartie.initialiserPartie();
    NouvellePartie.lancerPartie_Moyenne();
    
} else if (Difficulté == 3) {
    Partie NouvellePartie = new Partie(8,8);
    NouvellePartie.initialiserPartie();
    NouvellePartie.lancerPartie_Difficile();
}
}
}
