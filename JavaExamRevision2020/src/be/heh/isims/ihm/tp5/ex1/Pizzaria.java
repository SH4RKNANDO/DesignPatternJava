package be.heh.isims.ihm.tp5.ex1;

import java.util.Scanner;

public class Pizzaria {

    private static IPizza menu_base() {
        Scanner sc = new Scanner(System.in);
        int choix_base=0;
        
        while (choix_base <= 0  || choix_base > 4) {
            System.out.println("*-----------------*");
            System.out.println("| MAIN MENU PIZZA |");
            System.out.println("*-----------------*");
            System.out.println("Veuillez choisir une Pizza de base :");
            System.out.println("1) Pizza de classique [7€] (défaut)");
            System.out.println("2) fourre au fromage [12 €]");
            System.out.println("3) pate fine [9€]");
            choix_base = sc.nextInt();
        }
        return new PizzaBase(choix_base);
    }

    private static IPizza menu_supp(IPizza pizza_base) {
        Scanner sc = new Scanner(System.in);
        int val=0;
        IPizza pizza = pizza_base;
        
        while (val <= 0 || val > 8) {
            System.out.println("*-------------------*");
            System.out.println("| MENU  SUPPLEMENTS |");
            System.out.println("*-------------------*");
            System.out.println("Veuillez choisir un supplément :");
            System.out.println("1) be.heh.isims.ihm.tp5.ex1.Oignons [0.5€]");
            System.out.println("2) fromage [1€]");
            System.out.println("3) boulette de viande [3€]");
            System.out.println("4) champigons [0.5€]");
            System.out.println("5) jambon [1€]");
            System.out.println("6) thon [2€]");
            System.out.println("7) olives noires [0.5€]");
            System.out.println("8) Print and Exit");
            val = sc.nextInt();
        }

        switch (val) {
            case 1:
                pizza = new Oignons(pizza_base);
                menu_supp(pizza);
                break;
            case 2:
                pizza = new Fromage(pizza_base);
                menu_supp(pizza);
                break;
            case 3:
                pizza = new BoulletteViande(pizza_base);
                menu_supp(pizza);
                break;
            case 4:
                pizza = new Champignons(pizza_base);
                menu_supp(pizza);
                break;
            case 5:
                pizza = new Jambon(pizza_base);
                menu_supp(pizza);
                break;
            case 6:
                pizza = new Thon(pizza_base);
                menu_supp(pizza);
                break;
            case 7:
                pizza = new OlivesNoires(pizza_base);
                menu_supp(pizza);
                break;
            case 8:
                if(pizza != null) {
                    System.out.println("======== Description ========");
                    pizza.afficheDescription();                                                                     
                    System.out.println("======== Prix ========");                                                   
                    System.out.println("Le prix total est " + Double.toString(pizza.calculePrix()) + "€");
                 }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + val);
        }
        return pizza;
    }

    public static void main(String[] args) {
        IPizza pizza_base;

        /* Pizza de base */
        pizza_base = menu_base();
        IPizza pizza_complete = menu_supp(pizza_base);
    }
}
