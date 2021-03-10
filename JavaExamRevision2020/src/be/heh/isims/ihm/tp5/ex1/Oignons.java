package be.heh.isims.ihm.tp5.ex1;

public class Oignons extends PizzaDecorateur{

    public Oignons(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void afficheDescription() {
        pizza.afficheDescription();
        System.out.println(" [+] supplements d'oignons [0.5€]");
    }

    @Override
    public Double calculePrix() {
        return pizza.calculePrix() + 0.5;
    }
}
