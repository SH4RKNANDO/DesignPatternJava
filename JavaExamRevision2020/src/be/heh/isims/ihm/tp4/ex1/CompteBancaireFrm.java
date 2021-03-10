package be.heh.isims.ihm.tp4.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompteBancaireFrm extends JFrame {

    /* ////////////////////////////// < Section Class be.heh.isims.ihm.tp4.ex1.CompteBancaireFrm > ////////////////////////////// */

    /* Attributs */
    private JLabel solde;
    private JTextField montant;
    private CompteBancaire compte;


    /* Default Builder */
    public CompteBancaireFrm() {

        this.setTitle("Compte Bancaire");
        this.setSize(450, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Add component to JFrame*/
        this.compte = new CompteBancaire(0);
        WindowsBuilder();

        this.setVisible(true);
    }


    /* ////////////////////////////// < Windows Components  > ////////////////////////////// */


    public void WindowsBuilder() {

        /* Set default Layout */
        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        /* Label Montant */
        co.add(new JLabel("Montant :"));

        /* JtextFiled Montant */
        montant = new JTextField("                ");

        /* Buttons Add Montant */
        JButton button	= new JButton("Ajouter montant");
        button.addActionListener(new AjouteMontantEcouteur());

        /* Label Montant */
        solde = new JLabel(" Votre solde = " + this.compte.getSolde());

        co.add(this.montant);
        co.add(button);
        co.add(this.solde);
    }

    /* ////////////////////////////// < Section Event Management > ////////////////////////////// */

    private class AjouteMontantEcouteur implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CompteBancaireFrm frameReference = CompteBancaireFrm.this;
            frameReference.add_montant();
        }
    }

    /* ////////////////////////////// < Section Screen Action > ////////////////////////////// */

    public void reloadSolde() {
        this.solde.setText("Votre solde = " + this.compte.getSolde());
    }

    public void add_montant() {
        try {
            this.compte.depot(Double.parseDouble(this.montant.getText()));
            this.reloadSolde();
        }
        catch (Exception e) { System.out.println("Error : " + e.getMessage()); }
    }

}


