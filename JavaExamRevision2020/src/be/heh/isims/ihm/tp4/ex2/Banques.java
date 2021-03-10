package be.heh.isims.ihm.tp4.ex2;

import java.util.ArrayList;

public class Banques {

    /* Attributs */
    private ArrayList<ACompte> lesComptes;

    /* Default Builder */
    public Banques() {
        this.lesComptes = new ArrayList<>();
    }

    /* /////////////////////////// < Section Comptes Action > /////////////////////////// */

    /* Get Compte from index */
    public ACompte getcompte(int index) { return lesComptes.get(index); }

    /* Add Compte */
    public void addCompte(ACompte compte) { this.lesComptes.add(compte); }

    /* Get All Comptes */
    public ArrayList<ACompte> collectionComptes() { return lesComptes; }

}
