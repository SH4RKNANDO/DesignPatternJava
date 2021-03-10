package be.heh.isims.ihm.tp5.ex1;

public class Thon extends PizzaDecorateur{

    public Thon(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void afficheDescription() {
        pizza.afficheDescription();
        System.out.println(" [+] supplement de thon [2€] ");
    }

    @Override
    public Double calculePrix() {
        return pizza.calculePrix() +2;
    }
}
