package GUI;

import javax.swing.*;

public class GUI extends JFrame {

    /* Default Builder */
    public GUI() {
        /* Création d'un container */
        JPanel jpan = new JPanel();

        /* Création des éléments */
        JButton jB1 = new JButton();
        JButton jB2 = new JButton();

        /* Ajouter les Bouton au JPANNEL*/
        jpan.add(jB1);
        jpan.add(jB2);

        /*Ajouter le Jpannel à la JFrame */
        this.add(jpan);
    }

}
