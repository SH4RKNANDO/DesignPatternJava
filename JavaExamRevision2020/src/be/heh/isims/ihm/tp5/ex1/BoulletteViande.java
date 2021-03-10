package be.heh.isims.ihm.tp5.ex1;

public class BoulletteViande extends PizzaDecorateur {

    public BoulletteViande(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void afficheDescription() {
       pizza.afficheDescription();
       System.out.println(" [+] supplement de boulette de viande [3€]");
    }

    @Override
    public Double calculePrix() {
        return pizza.calculePrix() +3;
    }
}