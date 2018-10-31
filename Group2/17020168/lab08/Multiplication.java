package lab_08;

public class Multiplication extends BinaryExpression {
    Expression left;
    Expression right;

    @Override
    public Expression left() {
        return left;
    }

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left.toString() + "*" +right.toString();
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
    }
}
