package be.heh.isims.ihm.tp4.ex2;

public class CompteCourant extends ACompte {

    /* Default Builder */
    public CompteCourant(double solde) {
        super(solde, true);
        this.setTauxInteret(0.05);
    }

    /* Retrait avec TauxInteret */
    @Override
    public void retrait(double montant) {
        montant += montant* getTauxInteret();
        super.retrait(montant);
    }

    /* Afficher le Solde */
    @Override
    public String toString() { return "<Compte Courant> : solde = " + this.getSolde() + " Euros"; }

}
