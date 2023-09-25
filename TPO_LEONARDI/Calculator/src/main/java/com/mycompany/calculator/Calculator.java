/*TPO PARTIE 3 
 * SEPTEMBRE 2023
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Calculator {

    public static void main(String[] args) {
        int nb1;
        int operateur;
        System.out.println("Please enter the operator: \n1) add \n2) substract \n3) multiply \n4) divide \n5) modulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre1:");
        nb1=sc.nextInt(); // On demande a sc de donner le prochain entier
        operateur = nb1;
        System.out.println(operateur); 
    }
}
