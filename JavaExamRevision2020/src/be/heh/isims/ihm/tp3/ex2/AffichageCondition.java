package be.heh.isims.ihm.tp3.ex2;

public class AffichageCondition implements IObserver {

    /* Attributs */
    private StationMeteo sm;

    /* Default Builder */
    public AffichageCondition(StationMeteo _sm) { this.sm = _sm; }

    @Override
    public void maj(int temp, int hum) {
        System.out.print("Température : " + temp + "°C - Humidité : " + hum + "% >> ");
    }


}
