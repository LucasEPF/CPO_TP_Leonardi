/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leonardi_version_console;

/**
 *
 * @author leona
 */
public class CelluleLumineuse {
    
private boolean etat;

public CelluleLumineuse() {
    etat = false;
    }

public void activerCellule() {
    etat = !etat;
}
public void eteindreCellule() {
    if (etat == true) {
        etat = false;
    }
}
public boolean estEteint() {
  
    if (etat == true) {
        return false;
    } else {
        return true;
    }
}
public boolean getEtat() {
    return etat;
}
@Override
public String toString () {
    return etat ? "X" : "O"; 
}
}
    