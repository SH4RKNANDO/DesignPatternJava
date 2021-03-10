package be.heh.isims.ihm.tp1.ex3;

import java.util.ArrayList;

public class Dossiers implements IAnnuaire {

    // Attributs
    private String nom;
    private ArrayList<IAnnuaire> mesDossiers;
	private ArrayList<IAnnuaire> mesFichiers;
	public int compteur;

	// Default Builder
	public Dossiers(String nom, int compteur) {
		this.mesDossiers = new ArrayList<>();
		this.mesFichiers = new ArrayList<>();
		this.nom = nom;
		this.compteur = compteur;
	}
	
    //Getter / Setter
    public String getNom() {
		return this.nom; 
	}
    public void setNom(String nom) {
		this.nom = nom; 
	}

    // Dossier and Files Managers
    public void addDossier(IAnnuaire dossier) {  
		mesDossiers.add(dossier); 
	}
	public void delDossier(IAnnuaire dossier){
		mesDossiers.remove(dossier);
	}
	public void addFichier(IAnnuaire fichier){
		mesFichiers.add(fichier);
	}
	public void delFichier(IAnnuaire fichier){
		mesFichiers.remove(fichier);
	}


	@Override
	public String affiche() {
		String result = "";
		for(int i=0; i < this.compteur; i++) { result += "\t"; }
		System.out.println(result + "Dossier : " + this.getNom());

		if(mesFichiers.size() > 0) { for (IAnnuaire fichier : mesFichiers) { fichier.affiche(); } }
		else { System.out.println( result + "- No Files"); }

		for (IAnnuaire dossier : mesDossiers) {
			dossier.affiche();
			this.compteur +=1;
		}
		return this.getNom();
	}

}