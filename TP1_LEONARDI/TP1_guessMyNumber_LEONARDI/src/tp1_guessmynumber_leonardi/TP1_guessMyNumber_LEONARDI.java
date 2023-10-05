/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_leonardi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class TP1_guessMyNumber_LEONARDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int Valeur;
    int Nbessais;
    int Diff;
    
    Random generateurAleat = new Random();
    int n = generateurAleat.nextInt(100);
    System.out.println(n);
    
    Nbessais = 0;
        
    Scanner sc = new Scanner(System.in);
    System.out.println("\n 1) Normal \n 2) Difficile");
    Diff = sc.nextInt();
    System.out.println("\n Donner un nombre entre 0 et 100");
    Valeur = sc.nextInt();
    
    if (Diff ==2) {
    
   while (Valeur < n || Valeur > n || Nbessais == 5) {
       System.out.println("\n compteur : " + Nbessais + "");
       
           if (Valeur < n) {
               System.out.println("Trop petit");
           } else if (Valeur > n) {
               System.out.println("Trop grand");
           } else if (Valeur == n) {
               System.out.println("Bravo tu as trouve");
           }
           System.out.println("\n Donner un nombre entre 0 et 100");
           Valeur = sc.nextInt();
           Nbessais= Nbessais + 1;
         
           }
    
    if (Diff ==1) {
    
   while (Valeur < n || Valeur > n) {
       System.out.println("\n compteur : " + Nbessais + "");
         
           if (Valeur < n) {
               System.out.println("Trop petit");
           } else if (Valeur > n) {
               System.out.println("Trop grand");
           } else if (Valeur == n) {
               System.out.println("Bravo tu as trouve");
           }
           System.out.println("\n Donner un nombre entre 0 et 100");
           Valeur = sc.nextInt();
           Nbessais= Nbessais + 1;
           
   }
    }
}  
}
    }




       
   
       

 

  
    


