package be.heh.isims.ihm.tp4.ex2;

public class CompteEpargne extends ACompte {

    /* Default Builder */
    public CompteEpargne(double solde) {
        super(solde, false);
        this.setTauxInteret(0.0042);
    }

    /* Calcul Intérets */
    public double calculInterets() {
        return this.getSolde()*this.getTauxInteret();
    }

    /* Afficher le Solde */
    @Override
    public String toString() {
        return "<Compte Epargne> : solde = " + this.getSolde() + " Euros";
    }

}
