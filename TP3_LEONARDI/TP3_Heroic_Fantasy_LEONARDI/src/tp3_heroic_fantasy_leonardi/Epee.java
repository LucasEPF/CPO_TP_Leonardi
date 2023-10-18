/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_leonardi;

/**
 *
 * @author leona
 */
public class Epee extends Arme {
    int finesse;
    
public Epee (String nom, int niveau, int Finesse) {
super(nom, niveau);
finesse = Finesse;

if (finesse>=100) {
    finesse = 100;
    System.out.println("La finesse ne peut pas dépasser 100"); 
}

}

}