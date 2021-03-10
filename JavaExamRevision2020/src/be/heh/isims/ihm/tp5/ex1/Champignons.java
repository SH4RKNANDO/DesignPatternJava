package be.heh.isims.ihm.tp5.ex1;

public class Champignons extends PizzaDecorateur{

    public Champignons(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void afficheDescription() {
        pizza.afficheDescription();
        System.out.println(" [+] supplements de champigons [0.5€]");
    }

    @Override
    public Double calculePrix() {
        return pizza.calculePrix()+0.5;
    }
}
