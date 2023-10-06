/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_leonardi;

/**
 *
 * @author leona
 */
public class TP2_Bieres_LEONARDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
7.0 ,"Dubuisson") ;

    uneBiere.lireEtiquette();
    uneBiere.Décapsuler();
    System.out.println(uneBiere) ;
    
    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 
6.6 ,"Abbaye de Leffe") ;
      
    deuxBiere.lireEtiquette();
    deuxBiere.Décapsuler();
    System.out.println(deuxBiere) ;
     
    BouteilleBiere troisBiere = new BouteilleBiere("Heineken", 
5.0 ,"Novelty") ;
    
        troisBiere.lireEtiquette();
        troisBiere.Décapsuler();
        System.out.println(troisBiere) ;
        
    BouteilleBiere quatreBiere = new BouteilleBiere("Leffe Rubie", 
6.0 ,"Andalouse") ;
    
        quatreBiere.lireEtiquette();
        quatreBiere.Décapsuler();
        System.out.println(quatreBiere) ;
    
    BouteilleBiere cinqBiere = new BouteilleBiere("Rince cochon", 
6.0 ,"Biérasse") ;
    
        cinqBiere.lireEtiquette();
        cinqBiere.Décapsuler();
        System.out.println(cinqBiere) ;
   
    }
      
}
