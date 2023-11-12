/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_leonardi_version_console;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author leona
 */
public class FenêtrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenêtrePrincipale
     */
        GrilleDeJeu grille;
        int nbLignes;
        int nbColonnes;
        int nbCoups;
        int nbCoupsMax=100;
       
 public void initialiserPartie() {
     
 grille.eteindreToutesLesCellules();
 grille.melangerMatriceAleatoirement(10);
 }
 
public FenêtrePrincipale() {
    
        initComponents();
        nbLignes = 6;
        nbColonnes = 6;
        grille = new GrilleDeJeu(nbLignes,nbColonnes);
        
        Plateau();
        initialiserPartie();
        
    }
    
    public void Plateau() {
        
        PanneauGrille.removeAll();
        PanneauBoutonsHorizontaux.removeAll();
        PanneauBoutonsVerticaux.removeAll();
        PanneauDifficulté.removeAll();
      
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        
        
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matricesCellules[i][j], 36,36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrill
            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100,
        nbColonnes*80, nbLignes*80));
        this.pack();
        this.revalidate();

        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new 
        org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 1 * 80, nbLignes * 80));
        this.pack();
        this.revalidate();
        
// création du panneau de boutons verticaux (pour les lignes) 
    for (int i = 0; i < nbLignes; i++) {
        final int ligne = i;
        JButton bouton_ligne = new JButton(""+(i+1));
        bouton_ligne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerLigneDeCellules(ligne);
                repaint();
                FinDePartie(); 
                nbCoups++;
                nbCoupsMax--;
            }
        });
            PanneauBoutonsVerticaux.add(bouton_ligne);

    }
    PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
    getContentPane().add(PanneauBoutonsHorizontaux, new 
    org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, nbColonnes * 80, 1 * 80));
    this.pack();
    this.revalidate();
        
    for (int j = 0; j < nbColonnes; j++) {
        final int colonne = j;
        JButton bouton_colonne = new JButton(""+(j+1));
        bouton_colonne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerColonneDeCellules(colonne);
                repaint();
                FinDePartie();
                nbCoups++;
                nbCoupsMax--;
            }
        });
        PanneauBoutonsHorizontaux.add(bouton_colonne);

    }
    FinDePartie();
    
    PanneauDifficulté.setLayout(new GridLayout(1,3));
    getContentPane().add(PanneauDifficulté, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 3 * 80, 1 * 40));
    this.pack();
    this.revalidate();
    JButton boutonFacile = new JButton("Facile");
    JButton boutonMoyen = new JButton("Moyen");
    JButton boutonDifficile = new JButton("Difficile");
    PanneauDifficulté.add(boutonFacile);
    PanneauDifficulté.add(boutonMoyen);
    PanneauDifficulté.add(boutonDifficile);
    
    boutonFacile.addActionListener(new ActionListener() { // lorsqu'on clique dessus permet de creer une grille plus simple à résoudre (4X4)
            @Override
            public void actionPerformed(ActionEvent e) {
                nbLignes = 5;
                nbColonnes = 5;
                nbCoupsMax = 40;
                grille = new GrilleDeJeu(nbLignes, nbColonnes); // on fixe le nombre de lignes et de colonnes à 4 pour un niveau facile
                Plateau();// on appelle la méthode pour creer une nouvelle Grille avec les nombres de lignes/colonnes demandés
                initialiserPartie();
                PanneauDifficulté.removeAll();

            }
            });

    boutonMoyen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nbLignes = 7;
                nbColonnes = 7;
                nbCoupsMax = 30;
                grille = new GrilleDeJeu(nbLignes, nbColonnes);
                Plateau();
                initialiserPartie();
           
                
            }
            });
        
    boutonDifficile.addActionListener(new ActionListener() { // lorsqu'on clique dessus permet de creer une grille plus simple à résoudre (4X4)
            @Override
            public void actionPerformed(ActionEvent e) {

                nbLignes = 8;
                nbColonnes = 8;
                nbCoupsMax = 20;
                grille = new GrilleDeJeu(nbLignes, nbColonnes); // on fixe le nombre de lignes et de colonnes à 4 pour un niveau facile
                Plateau();// on appelle la méthode pour creer une nouvelle Grille avec les nombres de lignes/colonnes demandés
                initialiserPartie();
               

            }
            });

    }
    public void FinDePartie() {
        if(nbCoupsMax==0) { 
            dispose();
            System.out.println("Vous avez utilisé toutes vos tentatives. Réssayez"); // message affiché dans la console
        }
        if (grille.VerifToutesLesCellulesEteintes() == true) {
            PanneauGrille.setEnabled(false);
            PanneauBoutonsHorizontaux.setEnabled(false);
            PanneauBoutonsVerticaux.setEnabled(false);
            PanneauDifficulté.setEnabled(false);
        }

    }       
         


                       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        PanneauDifficulté = new javax.swing.JPanel();
        btnDiagonaleMontante = new javax.swing.JButton();
        btnDiagonaleDescendante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(51, 51, 255));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 460, 370));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 370));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 560, -1));

        javax.swing.GroupLayout PanneauDifficultéLayout = new javax.swing.GroupLayout(PanneauDifficulté);
        PanneauDifficulté.setLayout(PanneauDifficultéLayout);
        PanneauDifficultéLayout.setHorizontalGroup(
            PanneauDifficultéLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        PanneauDifficultéLayout.setVerticalGroup(
            PanneauDifficultéLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauDifficulté, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 70, 370));

        btnDiagonaleMontante.setText("DiagM");
        btnDiagonaleMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonaleMontanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagonaleMontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 40));

        btnDiagonaleDescendante.setText("DiagD");
        btnDiagonaleDescendante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonaleDescendanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagonaleDescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagonaleMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonaleMontanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
        nbCoups++;
        FinDePartie();
    }//GEN-LAST:event_btnDiagonaleMontanteActionPerformed

    private void btnDiagonaleDescendanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonaleDescendanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        repaint();
        nbCoups++;
        FinDePartie();
      
    }//GEN-LAST:event_btnDiagonaleDescendanteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenêtrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenêtrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenêtrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenêtrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenêtrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauDifficulté;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnDiagonaleDescendante;
    private javax.swing.JButton btnDiagonaleMontante;
    // End of variables declaration//GEN-END:variables
}
