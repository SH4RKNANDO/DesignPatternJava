public class monMain {

    public static void main(String[] args) {
        Coordinateur C1 = new Coordinateur("Naizy");
        Teacher T1 = new Teacher("Malaise");

        /*Get List of C1 and T1 normally is null or empty */
        C1.GetStudentList();
        T1.GetStudentList();

        /* the Student Subscribe to Coordinateur and Teacher */
        Student S1 = new Student();
        S1.Subscribe(C1);
        S1.Subscribe(T1);

        /* Modification of Student */
        S1.Modification("TOTO",12345);

        /*And the Teacher is Notify and The Coordinator too
        * and the list of Teacher and Coordinateur is only S1 */
        C1.GetStudentList();
        T1.GetStudentList();
    }

}
