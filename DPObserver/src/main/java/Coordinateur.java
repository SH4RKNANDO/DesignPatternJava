public class Coordinateur extends Sujet {

    /* Attributs */
    private String name;

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name;  }

    /* Default Builder */
    public Coordinateur() { }

    /* Default Builder */
    public Coordinateur(String _name) { setName(_name); }

}
