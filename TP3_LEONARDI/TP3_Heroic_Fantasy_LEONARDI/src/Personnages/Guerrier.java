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
public class Guerrier extends Personnage {
        boolean cheval;
        
    public Guerrier(String nom, int NiveauDevie, boolean Cheval, Arme Arme_actuelle) {
        super(nom, NiveauDevie, Arme_actuelle);
        cheval = Cheval;
    }
    
}
