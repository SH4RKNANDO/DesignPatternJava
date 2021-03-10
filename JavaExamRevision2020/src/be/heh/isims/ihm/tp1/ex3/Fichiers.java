package be.heh.isims.ihm.tp1.ex3;

public class Fichiers implements IAnnuaire {

    // Attributs
    private String nom;
    public int compteur;

	// Default Builder
	public Fichiers(String nom, int compteur) {
	    this.nom = nom;
	    this.compteur=compteur;
	}
	
    // Getter/Setter
    public String getNom() {
		return nom;
	}
    public void setNom(String nom) {
		this.nom = nom;
	}

    @Override
    public String affiche() {
        String result = "";
        for(int i=0; i < this.compteur; i++) { result += "\t"; }
	    System.out.println( result + "- "  + getNom());
        return this.getNom();
	}
}