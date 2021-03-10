package be.heh.isims.ihm.tp1.ex2;

public class Client {

    public static void main(String[] args) {

        /* Create an province */
        Provinces Hainaut = new Provinces();
        Provinces Namur = new Provinces();

        /* Create be.heh.isims.ihm.tp1.ex2.Ville */
        Ville Mons = new Ville();
        Ville Dinant = new Ville();
        Ville Charlerois = new Ville();

        /* Create be.heh.isims.ihm.tp1.ex2.Magasin Chains  */
        Magasin Saturne = new Magasin(0);
        Magasin Julles = new Magasin(0);
        Magasin MediaMarkt = new Magasin(0);

        /* Add Mons Benefice */
        Saturne.setBenefice(1200);
        Julles.setBenefice(1200);
        MediaMarkt.setBenefice(2400);
        Mons.addBilan(Saturne);
        Mons.addBilan(Julles);
        Mons.addBilan(MediaMarkt);

        /* Set and add Benefice to Dinant */
        Saturne.setBenefice(2400);
        Julles.setBenefice(2400);
        MediaMarkt.setBenefice(2400);
        Dinant.addBilan(Saturne);
        Dinant.addBilan(Julles);
        Dinant.addBilan(MediaMarkt);

        /* Set and add Benefice to Charlerois */
        Saturne.setBenefice(1250);
        Julles.setBenefice(4500);
        MediaMarkt.setBenefice(2400);
        Charlerois.addBilan(Saturne);
        Charlerois.addBilan(Julles);
        Charlerois.addBilan(MediaMarkt);


        /* Add be.heh.isims.ihm.tp1.ex2.Magasin to province */
        Hainaut.addBilan(Mons);
        Hainaut.addBilan(Charlerois);
        Namur.addBilan(Dinant);

        System.out.println("\nBilan par be.heh.isims.ihm.tp1.ex2.Ville");
        System.out.println("Bilan Dinant : "+ Namur.calculeBenefice());
        System.out.println("Bilan Mons : " + Mons.calculeBenefice());
        System.out.println("Bilan Charlerois : " + Charlerois.calculeBenefice());

        System.out.println("\nBilan par Province");
        System.out.println("Bilan Namur : " + Namur.calculeBenefice());
        System.out.println("Bilan Hainaut : " + Hainaut.calculeBenefice());

    }

}