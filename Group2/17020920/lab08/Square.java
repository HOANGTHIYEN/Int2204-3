package Lap08;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression e) { expression = e; }

    @Override
    public String toString() {

        return String.format("(%s)^2", expression);
    }

    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
}