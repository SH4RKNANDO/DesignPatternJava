public class Fichier {

    /* Attributs */
    private Compression TypeCompression;
    private String name;

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name; }

    /* Default Builder */
    public Fichier() { TypeCompression = new Compression(); }

    public Fichier(String _name) {  setName(_name);  TypeCompression = new Compression(); }

    /* Builder Surcharge */
    public Fichier(Compression c, String _name) {  TypeCompression = c; setName(_name);  }


    /* Changement du type de compression */
    public void SetCompression(Compression compression) {  TypeCompression = compression;  }

    /* Retourner la compression sous forme de String */
    public String GetCompression() {  return  "Le Fichier " + getName() + " a comme compression : " +  TypeCompression.Compression();  }

}
