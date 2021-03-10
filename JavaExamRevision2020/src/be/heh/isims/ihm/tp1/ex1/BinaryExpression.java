package be.heh.isims.ihm.tp1.ex1;

import java.util.ArrayList;
import java.util.List;

/* Composite */
public class BinaryExpression implements IExpression {

    private List<IExpression> expressions;

    /* Default Builder */
    public BinaryExpression(){
        expressions = new ArrayList<IExpression>();
    }

    /* Add and Remove Expression */
    public void add(IExpression expression){
        this.expressions.add(expression);
    }
    public void remove(IExpression expression){
        this.expressions.remove(expression);
    }

    public int evaluate() {
        int sum = 0;
        for(IExpression expression:this.expressions)
            sum += expression.evaluate();
        return sum;
    }
}
