package be.heh.isims.ihm.tp5.ex1;

public class OlivesNoires extends PizzaDecorateur{

    public OlivesNoires(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void afficheDescription() {
        pizza.afficheDescription();
        System.out.println(" [+] supplement des olives noires [0.5€]");
    }

    @Override
    public Double calculePrix() {
        return pizza.calculePrix() + 0.5;
    }
}
