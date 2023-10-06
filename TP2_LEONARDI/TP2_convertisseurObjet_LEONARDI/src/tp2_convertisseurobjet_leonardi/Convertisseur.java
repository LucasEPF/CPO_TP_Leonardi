/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_leonardi;

/**
 *
 * @author leona
 */

public class Convertisseur {
    int nbConversions;
    
    public double CelciusVersKelvin (double tCelcius) {
        return tCelcius + 273.15;
    }
    
    public double KelvinVersCelcius (double tKelvin) {
        return tKelvin - 273.15;
    }
    
    public double FarenheitVersCelcius (double tFarenheit) {
        return (tFarenheit - 32) * 5/9;
    }

    public double CelciusVersFarenheit (double tCelcius) {
        return (tCelcius + 32) * 9/5;
    }
    
    public double FarenheitVersKelvin (double tFarenheit) {
        return (tFarenheit - 32) * 5/9 + 273.15;
    }
    
    public double KelvinVersFarenheit (double tKelvin) {
        return (tKelvin - 273.15) * 9/5 + 32;
    }
    
public Convertisseur() {
    nbConversions = 0;
}
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}
}


