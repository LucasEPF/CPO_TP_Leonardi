/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;

/**
 *
 * @author leona
 */
public class Magicien extends Personnage {
    
    boolean confirmé;
    
    public Magicien(String nom, int NiveauDevie, boolean Confirmé, Arme Arme_Actuelle) {
        super(nom, NiveauDevie, Arme_Actuelle);
        confirmé = Confirmé;
    }
    
}
