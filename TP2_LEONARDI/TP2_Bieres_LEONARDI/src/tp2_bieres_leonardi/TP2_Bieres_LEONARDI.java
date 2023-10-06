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
    
    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 
6.6 ,"Abbaye de Leffe") ;
      
    deuxBiere.lireEtiquette();
    
    BouteilleBiere troisBiere = new BouteilleBiere("Heineken", 
5.0 ,"Novelty") ;
    
        troisBiere.lireEtiquette();
        
    BouteilleBiere quatreBiere = new BouteilleBiere("Leffe Rubie", 
6.0 ,"Andalouse") ;
    
        quatreBiere.lireEtiquette();
    
    BouteilleBiere cinqBiere = new BouteilleBiere("Rince cochon", 
6.0 ,"Biérasse") ;
    
        cinqBiere.lireEtiquette();
    
    }
      
}
