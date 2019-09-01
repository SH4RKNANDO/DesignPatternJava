public class monMain {

    public static void main(String[] args) {

        Coordinateur c1 = new Coordinateur("Coordinateur");
        Teacher t1 = new Teacher("T1");
        Student S1;

        /* Coordinateur doit Abonner t1 */
        c1.Abonne(t1);


        /* Initialisation de l'étudiant*/
        S1 =  new Student("Student",1234);

        /* Notifer aux professeur que S1 a changé */
        c1.Notifie(S1.getName(), S1.getMatricule());

        /* Afficher l'élève du professeur */
        System.out.println("\nMatricule de l'élève : " + t1.getS1().getMatricule() +"\nNom de l'élève : " + t1.getS1().getName());

        /* ------------------------------------------------------------------------------------------------------------
        * ------------------------------------------------------------------------------------------------------------  */

        /* Modification du Matricule */
        S1 =  new Student("Student",111111);

        /* Notifer aux professeur que S1 a changé */
        c1.Notifie(S1.getName(), S1.getMatricule());

        /* Afficher l'élève du professeur */
        System.out.println("\nMatricule de l'élève : " + t1.getS1().getMatricule() +"\nNom de l'élève : " + t1.getS1().getName());

        /* ------------------------------------------------------------------------------------------------------------
         * ------------------------------------------------------------------------------------------------------------  */


        /* Modification du Nom */
        S1 =  new Student("TOTO",111111);

        //Noitifer aux professeur que S1 a changé
        c1.Notifie(S1.getName(), S1.getMatricule());

        /* Afficher l'élève du professeur */
        System.out.println("\nMatricule de l'élève : " + t1.getS1().getMatricule() +"\nNom de l'élève : " + t1.getS1().getName());



    }
}
