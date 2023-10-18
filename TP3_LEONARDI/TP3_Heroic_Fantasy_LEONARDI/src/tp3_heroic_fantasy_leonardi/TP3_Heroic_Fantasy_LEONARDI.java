/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_leonardi;

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
    
}
    
    
    
    
}
