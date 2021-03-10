package be.heh.isims.ihm.tp2.ex2;

public class FormatMail extends AFormat {

    /* Attributs */
    private String value;

    /* Getter / Setters */
    @Override
    public String getValue() { return value; }
    @Override
    public void setValue(String value) { this.value = value; }


    /* Default Builder */
    public FormatMail() { }


    @Override
    public boolean isValid() {
        try {
            int index = this.value.indexOf("@");
            if(index == -1) return false;
            else return true;
        }
        // This is not mail Address
        catch (Exception e) { return false; }

    }


}
