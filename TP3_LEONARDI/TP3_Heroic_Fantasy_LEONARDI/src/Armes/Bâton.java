/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author leona
 */
public class Bâton extends Arme {
    int age;

 public Bâton(String nom, int niveau, int âge) {
    super(nom, niveau);
    age = âge;
    
    if (age>=100) {
        age = 100;
        System.out.println("l'âge ne peut pas dépasser 100");
    }
}
    
}
