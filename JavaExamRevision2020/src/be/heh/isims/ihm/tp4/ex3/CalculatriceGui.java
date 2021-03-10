package be.heh.isims.ihm.tp4.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatriceGui extends JFrame implements ActionListener {

    /* Attributs */
    private JTextField textbox;
    private JLabel label;
    private double nb1=0;
    private double nb2=0;
    private String operation = "";
    private boolean isNumber2 = false;
    private boolean operationEnd = false;
    private double result=0;

    /* Getter / Setter */
    public JTextField getTextbox() { return textbox; }
    public void setTextbox(JTextField textbox) { this.textbox = textbox; }
    public JLabel getLabel() { return label; }
    public void setLabel(JLabel label) { this.label = label; }
    public double getNb1() { return nb1; }
    public void setNb1(double nb1) { this.nb1 = nb1; }
    public double getNb2() { return nb2; }
    public void setNb2(double nb2) { this.nb2 = nb2; }


    public CalculatriceGui() {
        this.setTitle("Calculatrice JAVA");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(2,2));

        // Add Btn
        addLabel();
        AddBtn();

        this.setVisible(true);
    }

    /* /////////////////////////////// < Event Manager > //////////////////////////////////// */

    private void addLabel() {
        JPanel jPanelNord = new JPanel();
        jPanelNord.setLayout(new GridLayout(2,2));

        // Add the Label
        this.label = new JLabel("");
        this.label.setMaximumSize(new Dimension(50,50));
        jPanelNord.add(label);

        // Add TextBox
        this.textbox = new JTextField();
        this.textbox.setEditable(false);
        jPanelNord.add(this.textbox);

        this.getContentPane().add(jPanelNord,BorderLayout.NORTH);
    }

    private void AddBtn() {

        // Add number Button
        JPanel jPanelCenter = new JPanel();
        GridLayout gl = new GridLayout(5,4);
        gl.setHgap(5);
        gl.setVgap(5);
        jPanelCenter.setLayout(gl);

        JButton disabled = new JButton();
        disabled.setEnabled(false);
        jPanelCenter.add(disabled);

        JButton disabled2 = new JButton();
        disabled2.setEnabled(false);
        jPanelCenter.add(disabled2);

        JButton JButtonDel = new JButton("DEL");
        JButtonDel.addActionListener(this);
        JButtonDel.setActionCommand("DEL");
        jPanelCenter.add(JButtonDel);

        JButton JButtonAc = new JButton("AC");
        JButtonAc.addActionListener(this);
        JButtonAc.setActionCommand("AC");
        jPanelCenter.add(JButtonAc);


        /* Add Number 0 -> 9*/
        for(int i=1; i <= 9; i++) {
            JButton JButton = new JButton(Integer.toString(i));
            JButton.addActionListener(this);
            JButton.setActionCommand(Integer.toString(i));
            jPanelCenter.add(JButton);

            switch(i) {
                case 3:
                    JButton jButtonDivide = new JButton("/");
                    jButtonDivide.addActionListener(this);
                    jButtonDivide.setActionCommand("/");
                    jPanelCenter.add(jButtonDivide);
                    break;
                case 6:
                    JButton jButtonMulti = new JButton("*");
                    jButtonMulti.addActionListener(this);
                    jButtonMulti.setActionCommand("*");
                    jPanelCenter.add(jButtonMulti);
                    break;
                case 9:
                    JButton jButtonMoins = new JButton("-");
                    jButtonMoins.addActionListener(this);
                    jButtonMoins.setActionCommand("-");
                    jPanelCenter.add(jButtonMoins);
                    break;
            }
        }

        JButton jButton0 = new JButton(Integer.toString(0));
        jButton0.addActionListener(this);
        jPanelCenter.add(jButton0);

        JButton jButtonPoint = new JButton(".");
        jButtonPoint.addActionListener(this);
        jButtonPoint.setActionCommand(".");
        jPanelCenter.add(jButtonPoint);

        JButton jButtonEqual = new JButton("=");
        jButtonEqual.addActionListener(this);
        jButtonEqual.setActionCommand("=");
        jPanelCenter.add(jButtonEqual);

        JButton jButtonPlus = new JButton("+");
        jButtonPlus.addActionListener(this);
        jButtonPlus.setActionCommand("+");
        jPanelCenter.add(jButtonPlus);

        this.getContentPane().add(jPanelCenter,BorderLayout.CENTER);
    }


    /* /////////////////////////////// < Event Manager > //////////////////////////////////// */

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = ((JButton) e.getSource()).getActionCommand();
        this.textbox.setText(this.textbox.getText() + command);
        try {
            if(isNumber2) {
                this.nb2 = Double.parseDouble(command);
                System.out.println("Number2 Parsed");
            }
            else {
                this.nb1 = Double.parseDouble(command);
                System.out.println("Number1 Parsed");
            }
        }
        catch (Exception ex) {
            System.out.println("Command Parsed");
            switch (command) {
                case "=":
                    this.getResult(operation, nb1, nb2);
                    this.label.setText(nb1 + operation + nb2 + " = " + result);
                    this.textbox.setText("" + this.result);
                    break;
                case "AC":
                    reset();
                    break;
                case "DEL":
                    // TODO
                    break;
                default:
                    this.operation = command;
                    this.isNumber2 = true;
                    break;
            }
        }
    }

    /* /////////////////////////////// < Calculatrice Function > //////////////////////////////////// */


    private void getResult(String operation, double nb1, double nb2) {
        switch (operation) {
            case "+":
                this.result += plus(nb1, nb2);
                break;
            case "*":
                this.result += fois(nb1, nb2);
                break;
            case "/":
                this.result += divise(nb1, nb2);
                break;
            case "-":
                this.result += moins(nb1, nb2);
                break;
        }
    }

    private void reset() {
        this.textbox.setText("");
        this.label.setText("");
        this.result=0;
        this.nb1=0;
        this.nb2=0;
        this.isNumber2=false;
    }

    private double plus(double nb1, double nb2) { return nb1+nb2; }
    private double moins(double nb1, double nb2) { return nb1-nb2; }
    private double fois(double nb1, double nb2) { return nb1*nb2; }
    private double divise(double nb1, double nb2) { return nb1/nb2; }
}
