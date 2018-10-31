package lab08.bai1;

public class Multiplication extends BinaryExpression{
    Expression left;
    Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return null;
    }

    @Override
    public Expression right() {
        return null;
    }

    @Override
    public String toString() {
        return left.toString() + "*" + right.toString();
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
    }

}

