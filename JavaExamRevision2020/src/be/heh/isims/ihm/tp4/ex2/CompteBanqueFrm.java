package be.heh.isims.ihm.tp4.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;


public class CompteBanqueFrm extends JFrame {

    /* Attributs */
    private Banques banques;
    private JTextField montantTextBox;
    private JComboBox<ACompte> comboBox;
    private ButtonGroup buttonGroup;
    private JTextArea jTextArea;

    /* Default Builder */
    public CompteBanqueFrm() {

        this.setTitle("Compte Bancaire");
        this.setSize(350, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* init the objects */
        this.banques = new Banques();
        this.banques.addCompte(new CompteCourant(0));
        this.banques.addCompte(new CompteEpargne(0));

        /* Add component to JFrame */
        WindowsBuilder();

        this.setVisible(true);
    }


    /* ////////////////////////////// < Windows Components  > ////////////////////////////// */


    private void WindowsBuilder() {

        /* ////////////////////////// < First LINES > ////////////////////////// */

        /* FirstLine */
        JPanel first_line = new JPanel();
        first_line.setLayout(new BoxLayout(first_line, BoxLayout.LINE_AXIS));

        /* Label Montant */
        JLabel montant = new JLabel("Montant ");
        montant.setAlignmentX(Component.LEFT_ALIGNMENT);
        montant.setAlignmentY(Component.CENTER_ALIGNMENT);
        first_line.add(montant);

        /* TextBox Montant */
        this.montantTextBox = new JTextField();
        this.montantTextBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.montantTextBox.setAlignmentY(Component.CENTER_ALIGNMENT);
        this.montantTextBox.setMaximumSize(new Dimension(100, 100));
        first_line.add(this.montantTextBox);

        /* ////////////////////////// < SECOND LINES > ////////////////////////// */

        /* FirstLine */
        JPanel second_line = new JPanel();
        second_line.setLayout(new BoxLayout(second_line, BoxLayout.LINE_AXIS));

        /* Label Compte */
        JLabel LabelCompte = new JLabel("Compte ");
        LabelCompte.setAlignmentX(Component.LEFT_ALIGNMENT);
        LabelCompte.setAlignmentY(Component.CENTER_ALIGNMENT);
        second_line.add(LabelCompte);

        /* ComboBox Compte */
        this.comboBox = new JComboBox<ACompte>(new Vector<ACompte>(this.banques.collectionComptes()));
        this.comboBox.setMaximumSize(new Dimension(250, 100));
        second_line.add(this.comboBox);

        /* ////////////////////////// < Third Lines > ////////////////////////// */

        /* Third */
        JPanel third_line = new JPanel();
        third_line.setLayout(new BoxLayout(third_line, BoxLayout.LINE_AXIS));

        /* Label Transaction */
        JLabel LabelTransaction = new JLabel("Transaction ");
        LabelTransaction.setAlignmentX(Component.LEFT_ALIGNMENT);
        LabelTransaction.setAlignmentY(Component.CENTER_ALIGNMENT);
        third_line.add(LabelTransaction);

        /* RadioBtn Depot */
        JRadioButton RadioDepot = new JRadioButton("Dépots");
        LabelTransaction.setAlignmentX(Component.LEFT_ALIGNMENT);
        LabelTransaction.setAlignmentY(Component.CENTER_ALIGNMENT);
        third_line.add(RadioDepot);

        /* RadioBtn Retrait */
        JRadioButton RadioRetrait = new JRadioButton("Retrait");
        LabelTransaction.setAlignmentX(Component.LEFT_ALIGNMENT);
        LabelTransaction.setAlignmentY(Component.CENTER_ALIGNMENT);
        third_line.add(RadioRetrait);

        /* Button Group */
        this.buttonGroup = new ButtonGroup();
        this.buttonGroup.add(RadioDepot);
        this.buttonGroup.add(RadioRetrait);

        /* ////////////////////////// < Fourth Lines > ////////////////////////// */

        /* Fourth */
        JPanel fourth_line = new JPanel();
        fourth_line.setLayout(new BoxLayout(fourth_line, BoxLayout.LINE_AXIS));

        /* Btn Valider */
        JButton BtnValider  = new JButton("Valider");
        BtnValider.setAlignmentX(Component.LEFT_ALIGNMENT);
        BtnValider.setAlignmentY(Component.CENTER_ALIGNMENT);

        BtnValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CompteBanqueFrm frameReference = CompteBanqueFrm.this;
                frameReference.Valider();
            }
        });

        fourth_line.add(BtnValider);
        fourth_line.add(Box.createRigidArea(new Dimension(10,0)));

        /* Btn CalculInterets */
        JButton BtnCalculInteret = new JButton("Calculer les intérets");
        BtnCalculInteret.setAlignmentX(Component.LEFT_ALIGNMENT);
        BtnCalculInteret.setAlignmentY(Component.CENTER_ALIGNMENT);

        BtnCalculInteret.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CompteBanqueFrm frameReference = CompteBanqueFrm.this;
                frameReference.CalculInterets();
            }
        });

        fourth_line.add(BtnCalculInteret);

        /* ////////////////////////// < Five Lines > ////////////////////////// */

        /* Fourth */
        JPanel five_line = new JPanel();
        five_line.setLayout(new BoxLayout(five_line, BoxLayout.LINE_AXIS));

        /* Text Area */
        this.jTextArea  = new JTextArea();
        this.jTextArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.jTextArea.setAlignmentY(Component.CENTER_ALIGNMENT);

        /* JScrollPane */
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.getViewport().setBackground(Color.WHITE);
        jScrollPane.getViewport().add(jTextArea);

        five_line.add(jScrollPane);


        /* ////////////////////////// < MAIN PANEL > ////////////////////////// */

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        /* Add Lines */
        panel.add(Box.createRigidArea(new Dimension(5,10)));
        panel.add(first_line);
        panel.add(Box.createRigidArea(new Dimension(5,10)));

        panel.add(second_line);
        panel.add(Box.createRigidArea(new Dimension(5,10)));

        panel.add(third_line);
        panel.add(Box.createRigidArea(new Dimension(5,10)));

        panel.add(fourth_line);
        panel.add(Box.createRigidArea(new Dimension(5,10)));

        panel.add(five_line);

        this.add(panel);
    }


    /* ////////////////////////////// < Section Event Management > ////////////////////////////// */

    private void CalculInterets() {
        ACompte compte = this.banques.getcompte(this.comboBox.getSelectedIndex());

        // If Account was not courrant
        if(!compte.isCourant()) {
            CompteEpargne compteEpargne = (CompteEpargne)compte;

            double interet = compteEpargne.calculInterets();
            this.jTextArea.append("Taux Intérets : " + interet + "\n");
        }
    }


    private void Valider() {
        try {
            // Check if textbox is not empty
            if(!this.montantTextBox.getText().equals("")) {
                double montant = Double.parseDouble(this.montantTextBox.getText());
                ACompte compte = this.banques.getcompte(this.comboBox.getSelectedIndex());
                String action = this.getSelectedButtonText(this.buttonGroup);
                menuAction(action, compte, montant);
            }
            else System.out.println("Error : no value montant");
        }
        catch (Exception e) { System.out.println("Error : " + e.getMessage()); }
    }

    private void menuAction(String action, ACompte compte, double montant) {
        switch (action) {
            case "Dépots":
                compte.depot(montant);
                this.jTextArea.append(compte.toString() + "\n");
                break;
            case "Retrait":
                compte.retrait(montant);
                this.jTextArea.append(compte.toString() + "\n");
                break;
            case "":
                System.out.println("Error : No action Selected !");
                break;
        }
    }

    /* ////////////////////////////// < Section Screen Action > ////////////////////////////// */

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) return button.getText();
        }
        return "";
    }

}
