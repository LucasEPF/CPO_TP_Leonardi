/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author leona
 */
public class Guerrier extends Personnage {
        boolean cheval;
    public Guerrier(String Nom, int Niveaudevie, boolean Cheval) {
        super(Nom, Niveaudevie);
        cheval = Cheval;
    }
    
}
