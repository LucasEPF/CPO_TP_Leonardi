/*
 * TP1, partie 2 LEONARDI
 * TDC
 */
package tp1_convertisseur_leonardi;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class TP1_convertisseur_LEONARDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int Celsius;
    double CelsiusVersFarenheit;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n Donner nombre réelle:");
    Celsius = sc.nextInt(); // On demande a sc de donner le prochain entier
    System.out.println(Celsius);
    
    CelsiusVersFarenheit = Celsius * 9 / 5 + 32;
    System.out.println("\n La température en Farenheit est: " + CelsiusVersFarenheit + "");
    } 
public static double CelciusVersKelvin (double tCelcius) {
 … // à completer

}
}