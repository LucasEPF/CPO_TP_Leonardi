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
        double resultat;
        int operator;
        int operande1;
        int operande2;
        System.out.println("Please enter the operator: \n1) add \n2) substract \n3) multiply \n4) divide \n5) modulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Quel opérateur ?");
        operator=sc.nextInt();
        System.out.println("\n Entrer le nombre1:");
        operande1=sc.nextInt();
        System.out.println("\n Entrer le nombre2:");
        operande2=sc.nextInt();
   
        if (operator == 1) {
            resultat = operande1 + operande2;
        
        } else if (operator == 2) {       
            resultat = operande1 - operande2;
        
        } else if (operator == 3) {
            resultat = operande1 * operande2;
        
        } else if (operator == 4) {
            resultat = operande1 / operande2;
        
        } else if (operator == 5) {
            resultat = operande1 % operande2; 
            
        } else if (operator <1 & operator >5) {
            System.out.println("\n Erreur, cela doit être compris entre 1 et 5");
            
    }
    }
}
    
