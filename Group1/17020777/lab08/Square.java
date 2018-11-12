package Ex1;

import static java.lang.Math.pow;

public class Square extends Expression {
    private Expression expression;

    
    public Square(Expression e) { expression = e; }
    
    @Override
    public String toString() {
        return "("+expression+")^2";
    }
    
    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
}
