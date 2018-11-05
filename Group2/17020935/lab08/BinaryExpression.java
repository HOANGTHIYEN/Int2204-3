package lab8;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression a, Expression b) {
        left = a;
        right = b;
    }

    public Expression left() {
        return left; 
    }
    public Expression right() { 
        return right; 
    }

    @Override
    public abstract String toString();
    @Override
    public abstract int evaluate();
}