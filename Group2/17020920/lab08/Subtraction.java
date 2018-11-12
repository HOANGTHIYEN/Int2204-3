package Lap08;

public class Subtraction extends BinaryExpression {

    public Subtraction(Expression a, Expression b) {
        super(a, b);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
