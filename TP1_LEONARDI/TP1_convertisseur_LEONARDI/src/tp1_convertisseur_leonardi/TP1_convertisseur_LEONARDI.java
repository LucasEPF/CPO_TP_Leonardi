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
    int Celcius;
    int nb1;
    int Valeur;
    double CelciusVersKelvin;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n Donner nombre réelle:");
    Valeur = sc.nextInt(); // On demande a sc de donner le prochain entier
    
    System.out.println("\n 1) Kelvin vers Celcius \n 2) Farenheit Vers Celcius \n 3) Celcius Vers Farenheit \n 4) Kelvin Vers Farenheit \n 5) Farenheit Vers Kelvin");
    nb1 = sc.nextInt();
    
    if (nb1 == 1) {
        System.out.println("La température en Celcius est :" + KelvinVersCelcius(Valeur) + " degrès");
        
    } else if (nb1 == 2) {
        System.out.println("La température en Celcius est :" + FarenheitVersCelcius(Valeur) + " degrès");
    
    } else if (nb1 == 3) {
        System.out.println("La température en Farenheit est :" + CelciusVersFarenheit(Valeur) + " F");
    
    } else if (nb1 == 4) {
        System.out.println("La température en Farenheit est :" + KelvinVersFarenheit(Valeur) + " F");
    
    } else if (nb1 == 5) {
        System.out.println("La température en Kelvin est :" + FarenheitVersCelcius(Valeur) + " Kelvin");    
    }
    
    
} 
   
public static double CelciusVersFarenheit (double tCelcius) {
    return (tCelcius * 9 / 5) + 32;
}

public static double KelvinVersCelcius (double tKelvin) {
    return tKelvin - 273.15;
}
    
public static double FarenheitVersCelcius (double tFarenheit) {
    return (tFarenheit * 5 / 9) -32;
}

public static double KelvinVersFarenheit (double tKelvin) {
    return (tKelvin - 273.15) * 9 / 5 + 32;
}

public static double FarenheitVersKelvin (double tFarenheit) {
    return (tFarenheit - 32) * 5 / 9 + 273.15;
}

public static double CelciusVersKelvin (double tCelcius) {
    return tCelcius + 273.15;
}
}