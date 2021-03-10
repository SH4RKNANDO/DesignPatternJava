package be.heh.isims.ihm.tp3.ex2;

public class Client {
    public static void main(String[] args) {
        StationMeteo sm = new StationMeteo();

        AffichageCondition ac = new AffichageCondition(sm);
        AffichageStatistique as = new AffichageStatistique(sm);

        sm.register(ac);
        sm.register(as);

        sm.ajouterDonnees(20, 50);
        sm.ajouterDonnees(25, 65);
        sm.ajouterDonnees(27, 70);
    }
}