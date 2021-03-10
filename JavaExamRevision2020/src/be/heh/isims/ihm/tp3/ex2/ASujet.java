package be.heh.isims.ihm.tp3.ex2;

import java.util.ArrayList;

public abstract class ASujet {

    /* Attributs */
    private ArrayList<IObserver> observers;

    /* Default Builder */
    public ASujet() { observers = new ArrayList<>(); }

    /* Pattern Methods */
    public void register(IObserver o) { observers.add(o); }
    public void unregister(IObserver o) { observers.remove(o); }
    public void update(int temp, int hum) { for(IObserver o : observers) o.maj(temp,hum);  }

}
