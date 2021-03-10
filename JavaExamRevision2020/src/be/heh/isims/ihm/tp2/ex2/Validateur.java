package be.heh.isims.ihm.tp2.ex2;

public class Validateur  {

    /* Atrributs */
    private AFormat myFormat;
    private String value;

    /* Getter / Setter */
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }


    /* Default Buidler */
    public Validateur(AFormat format, String value) {
        this.myFormat = format;
        this.value = value;
    }

    public boolean isValid() {
        this.myFormat.setValue(this.value);
        return this.myFormat.isValid();
    }

}
