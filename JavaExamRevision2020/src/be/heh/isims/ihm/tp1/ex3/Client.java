package be.heh.isims.ihm.tp1.ex3;

public class Client {
	
    public static void main(String[] args) {

        Dossiers dossier1 = new Dossiers("Personnels", 0);
        Dossiers dossier2 = new Dossiers("Bots",1);
        Dossiers dossier3 = new Dossiers("Cours", 2);
		Dossiers dossier4 = new Dossiers("Dossier 4", 2);

        Fichiers fichier1 = new Fichiers("toto.txt", 0);
        Fichiers fichier2 = new Fichiers("lancement.bat",1);
        Fichiers fichier3 = new Fichiers("cours.pdf",2);
		Fichiers fichier4 = new Fichiers("test.bat",2);

        dossier4.addFichier(fichier4);
        dossier3.addFichier(fichier3);

        dossier2.addFichier(fichier2);
        dossier2.addDossier(dossier3);
        dossier2.addDossier(dossier4);

        dossier1.addFichier(fichier1);
		dossier1.addDossier(dossier2);

        dossier1.affiche();
    }
}