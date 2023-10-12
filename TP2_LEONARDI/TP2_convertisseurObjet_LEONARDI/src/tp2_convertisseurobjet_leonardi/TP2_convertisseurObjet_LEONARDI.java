/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_leonardi;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class TP2_convertisseurObjet_LEONARDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Saississez la température : ");
    double temp = sc.nextDouble();
    
    Convertisseur Convertisseur1 = new Convertisseur();
    Convertisseur Convertisseur2 = new Convertisseur();
    
    double tempKelvin1 = Convertisseur1.CelciusVersKelvin(temp);
    double tempFarenheit1 = Convertisseur1.CelciusVersFarenheit(temp);
    
    double Celcius2 = Convertisseur2.KelvinVersFarenheit(temp);
    double Farenheit2 = Convertisseur2.KelvinVersFarenheit(temp);
    
    System.out.println(Convertisseur1);
    System.out.println(Convertisseur2);
    
    
    Convertisseur Convertisseur3 = new Convertisseur();
    
    double Valeur;
    int nb1;
    
    
    System.out.println("\n 1) Kelvin vers Celcius \n 2) Farenheit Vers Celcius \n 3) Celcius Vers Farenheit \n 4) Kelvin Vers Farenheit \n 5) Farenheit Vers Kelvin");
    nb1 = sc.nextInt();
    
    System.out.println("\n Donner nombre réelle:");
    Valeur = sc.nextInt(); // On demande a sc de donner le prochain entier
    
    if (nb1 == 1) {
        System.out.println("La température en Celcius est :" + Convertisseur3.KelvinVersCelcius(Valeur) + " degrès");
        
    } else if (nb1 == 2) {
        System.out.println("La température en Celcius est :" + Convertisseur3.FarenheitVersCelcius(Valeur) + " degrès");
    
    } else if (nb1 == 3) {
        System.out.println("La température en Farenheit est :" + Convertisseur3.CelciusVersFarenheit(Valeur) + " F");
    
    } else if (nb1 == 4) {
        System.out.println("La température en Farenheit est :" + Convertisseur3.KelvinVersFarenheit(Valeur) + " F");
    
    } else if (nb1 == 5) {
        System.out.println("La température en Kelvin est :" + Convertisseur3.FarenheitVersCelcius(Valeur) + " Kelvin");    
    }
    
        
    } 
}

