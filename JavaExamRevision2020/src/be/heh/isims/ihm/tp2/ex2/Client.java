package be.heh.isims.ihm.tp2.ex2;

public class Client {

    public static void main(String[] args) {

        String txt;
        Validateur valEntier;
        Validateur valMail;

        txt = "6";
        valEntier = new Validateur(new FormatEntier(), txt);
        valMail = new Validateur(new FormatMail(), txt);

        System.out.println("La chaine de caractère : " + txt);
        System.out.println("Est-ce que " + txt + " est un entier valide ? " + valEntier.isValid());
        System.out.println("Est-ce que " + txt + " est un mail valide ? " + valMail.isValid());
        System.out.println("----------------------");

        txt = "toto@gmail.com";
        valEntier = new Validateur(new FormatEntier(), txt);
        valMail = new Validateur(new FormatMail(), txt);

        System.out.println("La chaine de caractère : " + txt);
        System.out.println("Est-ce que " + txt + " est un entier valide ? " + valEntier.isValid());
        System.out.println("Est-ce que " + txt + " est un mail valide ? " + valMail.isValid());
        System.out.println("----------------------");

    }

}