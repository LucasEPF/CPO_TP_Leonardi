/*
 *TP1 LEONARDI Lucas
 * TDC
 */

package com.mycompany.tp1_manipnombresint_leonardi;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class TP1_manipNombresInt_LEONARDI {

    public static void main(String[] args) {
    int nb1;
    int nb2;
    int somme;
    int difference;
    int produit;
    int quotient;
    int modulo; 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n Donner un entier :");
    nb1 = sc.nextInt(); // On demande a sc de donner le prochain entier
    System.out.println(nb1);
    
    System.out.println("\n Donner un deuxième entier:");
    nb2 = sc.nextInt(); // On demande a sc de donner le prochain entier
    System.out.println(nb2);
    
    somme = nb1 + nb2;
    difference = nb1 - nb2;
    produit = nb1 * nb2;
    quotient = nb1 / nb2; 
    modulo = nb1 % nb2;
    
    System.out.println("\n La somme de nb1 et nb2 est " + somme + "\n La différence de nb1 et nb2 est " + difference + "\n Le produit de nb1 et nb2 est " + produit + "\n Le quotient est " + quotient + "\n Le modulo est " + modulo + "");
    }
}
