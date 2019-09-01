public class Teacher extends Observer {

    /* Attribute */
    private String name;
    private Student s1 = new Student();

    /* Getter/ Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name;  }
    public Student getS1() {  return s1;  }
    public void setS1(Student s1) {  this.s1 = s1; }

    /* Default Builder */
    public Teacher() { }

    /* Custom Builder Surcharge */
    public Teacher(String _name) {  setName(_name);  }

    @Override
    public void Update(int matricule, String name) {
        s1.setMatricule(matricule);
        s1.setName(name);
    }
}
