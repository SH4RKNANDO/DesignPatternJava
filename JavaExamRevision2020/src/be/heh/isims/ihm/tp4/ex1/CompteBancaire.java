package be.heh.isims.ihm.tp4.ex1;

public class CompteBancaire {

    /* Attributs */
    private double solde;

    /* Getter / Setter */
    public double getSolde() { return solde; }

    /* Default Builder */
    public CompteBancaire(double solde){
        if(solde < 0.0) solde = 0.0;
        this.solde = solde;
    }

    public void depot(double montant) { this.solde += montant; }

}
