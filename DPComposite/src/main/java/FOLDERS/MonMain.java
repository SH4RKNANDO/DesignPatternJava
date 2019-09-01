package FOLDERS;

public class MonMain {

    public static void main(String[] args) {

        /* Creation d'un dossier Racine */
        Dossier root = new Dossier("Root");

        /* Ajouter un fichier a Root */
        root.AjouterFichier(new Fichier("RootFile"));

        /* Creation d'un dossier d1 */
        Dossier d1 = new Dossier("d1");

        /*Ajouter des fichiers a d1 */
        d1.AjouterFichier(new Fichier("f1"));
        d1.AjouterFichier(new Fichier("f2"));
        d1.AjouterFichier(new Fichier("f3"));

        /* Je vais donc ajouter mon dossier d1 a mon dossier Root */
        root.AjouterDossier(d1);

        /*Je veux donc voir le nom des mes fichiers et de mes dossier contenu dans la racine */

        /* Affiche la liste des fichiers du root */
        for(Fichier f: root.GetListFichiers()) { System.out.println(f.getName()); }

        /* Affiche la listes des dossiers du root */
        for(Dossier d: root.GetListDossiers()) {
            System.out.println(d.getName());

            /* Afficher les sousfichiers du Dossier d */
            for(Fichier sousfichiers : d.GetListFichiers()) { System.out.println(sousfichiers.getName()); }

            /* Afficher la liste des sous dossier du Dossier d */
            for (Dossier sousdossier: d.GetListDossiers()) {

                /* Afficher les sousfichiers du sousdossiers */
                for(Fichier sousfichiers2 : sousdossier.GetListFichiers()) { System.out.println(sousfichiers2.getName()); }
            }

        }
    }
}
