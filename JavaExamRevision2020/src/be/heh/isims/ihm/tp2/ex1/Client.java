package be.heh.isims.ihm.tp2.ex1;

public class Client {
	public static void main(String[] args){
		Facture maFacture = new Facture(50.50);
		
		System.out.println("Par defaut (Belgique)");
		System.out.println("---------------------");
		maFacture.affiche();
		System.out.println();
		
		maFacture.setAffichage(new AffichageAllemagne());
		
		System.out.println("Allemagne");
		System.out.println("---------");
		maFacture.affiche();
		System.out.println();
		
		maFacture.setAffichage(new AffichageRoyaumeUnis());
		
		System.out.println("Royaume-Unis");
		System.out.println("------------");
		maFacture.affiche();
		System.out.println();
	}
}