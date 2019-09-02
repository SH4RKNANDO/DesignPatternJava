public class Student implements IObserver {

    /* Attributs */
    private String name;
    private int matricule;

    /* Getter / Setter */
    public String getName() {  return name;  }
    public void setName(String name) { this.name = name;  }
    public int getMatricule() {  return matricule; }
    public void setMatricule(int matricule) { this.matricule = matricule; }

    /* Default Builder */
    public Student() { }

    /* Default Builder */
    public Student(int _matricule, String _name) {
        setName(_name);
        setMatricule(_matricule);
    }

    @Override
    public void update(int matricule, String name) { }
}
