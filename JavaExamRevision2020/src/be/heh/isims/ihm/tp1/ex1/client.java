package be.heh.isims.ihm.tp1.ex1;

public class client {

    public static void main(String[] args) {

        /* Set Expression Binary */
        BinaryExpression exp1 = new BinaryExpression();

        /* be.heh.isims.ihm.tp1.ex1.Number */
        IExpression number1 = new Number(5);
        IExpression number2 = new Number(10);
        BinaryExpression exp2 = new BinaryExpression();


        System.out.println("Pas encore de nombre : " + exp1.evaluate());

        /* Add Number1 to Expression1 */
        exp1.add(number1);
        System.out.println("Ajout de nombre 1 à ma première expression : " + exp1.evaluate());

        /* Add Number2 to Expression2 */
        exp2.add(number2);
        System.out.println("Ajout de nombre 2 à ma deuxieme expression : " + exp2.evaluate());


        /* Add Expression1 to Expression2 */
        exp1.add(exp2);
        System.out.println("Ajout de ma première expression à ma deuxième expression : " + exp1.evaluate());

    }

}
