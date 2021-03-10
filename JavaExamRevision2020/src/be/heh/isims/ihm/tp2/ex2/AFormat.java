package be.heh.isims.ihm.tp2.ex2;

public abstract class AFormat {

    /* Attributs */
    private String value;

    /* Getter / Setter */
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    /* Default */
    public AFormat() { }

    public boolean isValid() { return false; }
}
