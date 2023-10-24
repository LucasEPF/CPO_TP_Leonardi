/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_leonardi;

import Personnages.Personnage;
import Personnages.Guerrier;
import Personnages.Magicien;
import Armes.Epee;
import Armes.Arme;
import Armes.Bâton;
import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class TP3_Heroic_Fantasy_LEONARDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Epee Excalibur = new Epee ("Excalibur",7,5);
    Epee Durand = new Epee ("Durand",4,7);
    
    Bâton Chêne = new Bâton ("Chêne",4,5);
    Bâton Charme = new Bâton ("Charme",5,6);
    
    ArrayList<Arme> Coffre = new ArrayList<Arme>();
    Coffre.add(Excalibur);
    Coffre.add(Durand);
    Coffre.add(Chêne);
    Coffre.add(Charme);
    
    for (int i = 0; i < Coffre.size(); i++) {
        System.out.println(Coffre.get(i));
    }
    Magicien Gandalf = new Magicien ("Gandalf",65,true, null);
    Magicien Garcimore = new Magicien ("Garcimore",44,false,null);
    
    Guerrier Conan = new Guerrier ("Garcimore",78,false,null);
    Guerrier Lannister = new Guerrier ("Lannister",45,true,null);
    
    ArrayList<Personnage> Personnages = new ArrayList<Personnage>();
    Personnages.add(Gandalf);
    Personnages.add(Garcimore);
    Personnages.add(Conan);
    Personnages.add(Lannister);
    
    Magicien Lucas = new Magicien ("Lucas",99,true,null);
    Guerrier Honk = new Guerrier ("Honk",68,false,null);
    Bâton Bâton1 = new Bâton ("Bâton1", 30,10);
    Bâton Bâton2 = new Bâton ("Bâton2",10, 2);
    Bâton Bâton3 = new Bâton ("Bâton3", 8,5);
    Epee Epee1 = new Epee ("Epee1", 8, 1);
    Epee Epee2 = new Epee ("Epee2", 12,12);
    Epee Epee3 = new Epee ("Epee3", 36, 67);
    
    Honk.Inventaire(Bâton1);
    Honk.Inventaire(Epee2);
    Honk.Inventaire(Epee1);
    Honk.Equiper_Arme(Epee2);
    
    Lucas.Inventaire(Bâton2);
    Lucas.Inventaire(Bâton3);
    Lucas.Inventaire(Epee3);
    
    System.out.println(Lucas.toString());
    System.out.println(Honk.toString());
}   
}
