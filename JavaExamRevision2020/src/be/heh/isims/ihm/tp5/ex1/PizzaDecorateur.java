package be.heh.isims.ihm.tp5.ex1;

public class PizzaDecorateur implements IPizza {

    // Attributs
    protected IPizza pizza;

    // Constructeurs
    public PizzaDecorateur(IPizza pizza){
        this.pizza = pizza;
    }

    // Méthodes
    @Override
    public void afficheDescription() {
        pizza.afficheDescription();
    }

    @Override
    public Double calculePrix() { return pizza.calculePrix(); }
}
