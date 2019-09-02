public class Student extends Sujet {

    /* Attributs */
    private String name;
    private int matricule;

    /* Getter / setter */
    public String getName() {  return name;  }
    public int getMatricule() { return matricule; }

    /*Default Builder */
    public Student() { };

    /* Custom Builder */
    public Student(String _name, int _matricule) {  name = _name; matricule =  _matricule; };

    /* Method of Updating to Coordinateur and Teacher */
    public void Modification(String _name, int _matricule) { this.Notify(new Student(_name, _matricule), this ); }
}
