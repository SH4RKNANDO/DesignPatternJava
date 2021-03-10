package be.heh.isims.ihm.tp5.ex1;

public class Jambon extends PizzaDecorateur{

    public Jambon(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void afficheDescription() {
        pizza.afficheDescription();
        System.out.println(" [+] supplement de jambon [1€]");
    }

    @Override
    public Double calculePrix() {
        return pizza.calculePrix() + 1;
    }
}
