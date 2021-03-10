package be.heh.isims.ihm.tp5.ex1;

public class Fromage extends PizzaDecorateur{

    public Fromage(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void afficheDescription() {
        pizza.afficheDescription();
        System.out.println(" [+] supplement de fromage [1€]");
    }

    @Override
    public Double calculePrix() {
        return pizza.calculePrix() + 1;
    }
}