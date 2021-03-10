package be.heh.isims.ihm.tp2.ex2;

public class FormatEntier extends AFormat {

    /* Attributs */
    private String value;

    /* Getter / Setters */
    @Override
    public String getValue() { return value; }
    @Override
    public void setValue(String value) { this.value = value; }

    /* Default builder */
    public FormatEntier() { }

    @Override
    public boolean isValid() {
        try {
            int value = Integer.parseInt(this.value);
            return true;
        }
        // This is not integer
        catch (Exception e) { return false; }

    }

}
