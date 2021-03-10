package be.heh.isims.ihm.tp1.ex2;

import java.util.ArrayList;

public class Anoeud implements IBilan {

    /* Attributs  */
    public final ArrayList<IBilan> bilans;

    /* Default Builder */
    public Anoeud() { this.bilans = new ArrayList<>(); }

    /* Manage Bilans */
    public void addBilan(IBilan b) { this.bilans.add(b); }
    public void removeBilan(IBilan b) { this.bilans.remove(b);}

    /* Calcul the benefice foreach Ville/Province/Pays/*** */
    @Override
    public double calculeBenefice() {
        double benefice = 0;
        for (IBilan b: bilans) benefice += b.calculeBenefice();
        return benefice;
    }

}
