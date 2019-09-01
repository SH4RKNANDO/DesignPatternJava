package FOLDERS;

public class Fichier {

    /* Attributs */
    private  String name;

    /* Getter/Setter (Ascesseurs)*/
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name;  }


    /* Default Builder */
    public Fichier() { }

    /* Builder avec Surcharge */
    public Fichier(String _name) { setName(_name); }

}
