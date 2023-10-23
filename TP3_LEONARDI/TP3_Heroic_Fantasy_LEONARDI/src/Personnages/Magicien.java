/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author leona
 */
public class Magicien extends Personnage {
    
    boolean confirmé;
    
    public Magicien(String Nom, int Niveaudevie, boolean Confirmé) {
        super(Nom, Niveaudevie);
        confirmé = Confirmé;
    }
    
}
