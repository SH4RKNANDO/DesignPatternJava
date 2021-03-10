package be.heh.isims.ihm.tp3.ex1;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Saisi saisi = new Saisi();

        ConvBin convB = new ConvBin();
        ConvHex convH = new ConvHex();
        ConvOctale convO = new ConvOctale();

        saisi.register(convO);
        saisi.register(convB);
        saisi.register(convH);

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Saisir un entier :");
            saisi.setNumber(sc.nextInt());
        }

    }
}