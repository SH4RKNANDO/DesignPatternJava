package be.heh.isims.ihm.tp3.ex1;

public class Saisi extends ASujet {

    /* Attributs */
    private int number;

    /* Default Builder */
    public Saisi() { }

    /* Getter / setter */
    public int getNumber() { return number; }


    public void setNumber(int number) {
        this.number = number;
        this.update(this.number);
    }

}
