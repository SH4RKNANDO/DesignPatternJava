public class monMain {

    public static void main(String[] args) {
        Coordinateurs c1 = new Coordinateurs("Coordinateur");
        Teacher t1 = new Teacher("Teacher");
        Student S1 = new Student(1234,"Student1");

        /* Subscribe the Teacher to Coordinateurs */
        c1.Add(t1);

        /* Notify prof from Coordinateurs at Teacher */
        c1.Notify(S1.getMatricule(), S1.getName());
        t1.GetStudent();

        /* Change S1 Attributs  */
        S1.setName("TOTO");
        S1.setMatricule(12345);

        /* Noitify Teacher */
        c1.Notify(S1.getMatricule(), S1.getName());
        t1.GetStudent();
    }

}
