package be.heh.isims.ihm.tp4.ex2;

public abstract class ACompte {

    /* Attributs */
    private double solde;
    private boolean courant;
    private double tauxInteret;

    /* Getter / Setter */
    public boolean isCourant() { return courant; }
    public double getSolde() { return this.solde; }
    public void setSolde(double montant) { this.solde = montant; }
    public double getTauxInteret() { return tauxInteret; }
    public void setTauxInteret(double tauxInteret) { this.tauxInteret = tauxInteret; }

    /* Methods */
    public void depot(double montant) { this.solde += montant; }
    public void retrait(double montant) {
        this.solde -= montant;
        if(this.solde < 0) this.solde=0;
    }

    /* Default Builder */
    public ACompte(double solde,boolean courant) {
        if(solde < 0) solde = 0;
        this.solde = solde;
        this.courant = courant;
    }

}
