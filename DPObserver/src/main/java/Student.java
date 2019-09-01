public class Student extends Observer {

    /* Attribute */
    private int matricule;
    private String name;

    /* Getter / Setter */
    public int getMatricule() {  return matricule; }
    public void setMatricule(int matricule) {  this.matricule = matricule;  }
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name;  }

    /* Default Buidler */
    public Student() { }

    /* Custom Builder with Surcharge */
    public Student(String _name, int _matricule) {
        setName(_name);
        setMatricule(_matricule);
    }

    @Override
    public void Update(int matricule, String name) { }

}
