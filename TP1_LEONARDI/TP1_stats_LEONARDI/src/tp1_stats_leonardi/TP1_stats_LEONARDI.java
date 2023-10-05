/* TP1 PARTIE 4 TDC LEONARDI
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_leonardi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class TP1_stats_LEONARDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        // Étape 1: Créer d'un tableau de 6 entiers
        int[] tableau = new int[6];

        // Étape 2: Demander à l'utilisateur de saisir un nombre entier 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier :");
        int m = scanner.nextInt();

        // Étape 3: Faire une boucle de m itérations
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int resultat = random.nextInt(6);         
            tableau[resultat]++;
        }

        // Étape 4: Afficher le tableau résultat
        System.out.println("Résultats du lancer de dé :");
        for (int i = 0; i < tableau.length; i++) {
            // Étape 5: Afficher les résultats sous forme de pourcentages
            double Pourcentage = (double) tableau[i] / m * 100;
            System.out.println("Face " + (i + 1) + " : " + Pourcentage + "%");
        }
    }
}






