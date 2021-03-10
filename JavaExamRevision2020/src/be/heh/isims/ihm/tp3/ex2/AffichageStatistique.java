package be.heh.isims.ihm.tp3.ex2;

public class AffichageStatistique implements IObserver {

    /* Attributs */
    private StationMeteo sm;

    /* Default Builder */
    public AffichageStatistique(StationMeteo _sm) { this.sm = _sm; }

    private double get_moyenne() {
        double moyenne = 0;
        int element = (sm.getTemp()).size();
        for(int tmp : sm.getTemp()) moyenne += tmp;
        moyenne = moyenne/element;
        return moyenne;
    }

    private double get_max() {
        int max=0;
        for(int tmp : sm.getTemp()) if(tmp>max) max=tmp;
        return max;
    }

    private double get_min() {
        int min=0;
        for(int tmp : sm.getTemp()) {
            if(min == 0) min=tmp;
            if(tmp<min) min=tmp;
        }
        return min;
    }


    @Override
    public void maj(int temp, int hum) {
        System.out.print("Température Min/Max/Moy : " + get_min() + '/' + get_max() + '/' + get_moyenne() + "\n");
        System.out.println("----------------------------------------------------------------------------------");
    }

}

