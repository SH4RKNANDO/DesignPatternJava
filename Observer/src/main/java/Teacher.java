public class Teacher implements IObserver {

    /* Attributs */
    private String name;
    private Student student = new Student();

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) { this.name = name; }

    /* Default Builder */
    public Teacher() { }

    /* Custom Builder */
    public Teacher(String _name) {  setName(_name); }

    @Override
    public void update(int matricule, String name) {
        System.out.println("Update from Coordinateur ( Student => Name : " + name + " Matricule : " + matricule + " )");
        student.setMatricule(matricule);
        student.setName(name);
    }

    /* Display Student Infos */
    public void GetStudent() {  System.out.println("Student => Name : " + student.getName() + " Matricule : " + student.getMatricule()); }

}
