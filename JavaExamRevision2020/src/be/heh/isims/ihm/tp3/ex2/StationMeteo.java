package be.heh.isims.ihm.tp3.ex2;

import java.util.ArrayList;

public class StationMeteo extends ASujet {

    /* Attributs */
    private ArrayList<Integer> temp;
    private ArrayList<Integer> hum;

    /* Getter / Setter */
    public ArrayList<Integer> getTemp() { return temp; }
    public void setTemp(ArrayList<Integer> temp) { this.temp = temp; }
    public ArrayList<Integer> getHum() { return hum; }
    public void setHum(ArrayList<Integer> hum) { this.hum = hum; }

    /* Default Builder */
    public StationMeteo() {
        setTemp(new ArrayList<>());
        setHum(new ArrayList<>());
    }

    /* Ajouter les datas */
    public void ajouterDonnees(int tmp, int hum) {
        this.getTemp().add(tmp);
        this.getHum().add(hum);
        this.update(tmp, hum);
    }

}
