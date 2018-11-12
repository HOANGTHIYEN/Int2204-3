package Lap08;

public class Division extends BinaryExpression {
    public Division(Expression a, Expression b) {
        super(a, b);
    }

    @Override
    public Expression left() {
        return super.left();
    }

    @Override
    public Expression right() {
        return super.right();
    }

    @Override
    public String toString() {
        return String.format("%s / %s", left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
