import java.util.ArrayList;

public class Coordinateur implements IObserver {

    /* Private Attributs*/
    private ArrayList<Student> students = new ArrayList<>();
    private String name;

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name; }

    /* Default Buidler */
    public Coordinateur() { }

    /* Custom Builder */
    public Coordinateur(String _name) { setName(_name);}

    @Override
    public void update(Student s1, Student old) {
        System.out.println("\n\nFrom Coordinateur");
        System.out.println("Suppression de l'élève : " + old.getName() + " N° de matricule : " + old.getMatricule());
        students.remove(old);

        System.out.println("Ajout de l'élève : " + s1.getName() + " N° de matricule : " + s1.getMatricule() + "\n\n");
        students.add(s1);
    }


    public void GetStudentList() {
        for (Student student : students) {  System.out.println("From Coordinator => Etudiant : " + student.getName() + " " + student.getMatricule()); }
    }
}
