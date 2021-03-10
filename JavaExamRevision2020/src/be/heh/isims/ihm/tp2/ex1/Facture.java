package be.heh.isims.ihm.tp2.ex1;

public class Facture {
	
	// Attributs
	private double montant;
	private IAffiche affichage;

	// Getters
	public IAffiche getAffichage() {
		return this.affichage;
	}

	// Setters
	public void setAffichage(IAffiche affichage) {
		this.affichage = affichage;
	}

	// Constructeurs
	public Facture(double montant) {
		this.montant = montant;
		this.affichage = new AffichageBelgique();
	}

	// Méthodes
	public void affiche() {
		System.out.print(this.affichage.message());
		System.out.print(this.affichage.monnaie(this.montant));
		System.out.println();
	}
}