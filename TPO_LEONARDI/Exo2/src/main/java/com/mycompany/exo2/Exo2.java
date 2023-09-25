/*TPO EXO 2
 * SEPTEMBRE 2023
 */

package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Exo2 {

public static void main(String[] args) {
//Declaration des variables
int nb; // nombre d
int result; // resultat
int ind; //indice
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier

result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
ind += 1;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);


}      
}



