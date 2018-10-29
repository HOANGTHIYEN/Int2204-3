package bai1;

public class Division extends BinaryExpression {
    protected Expression left;
    protected Expression right;

    public Division(){}
    public Division(Expression ex1, Expression ex2)
    {
        this.left = ex1;
        this.right = ex2;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return left().toString() + "/" + right().toString();
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public int evaluate() {
        return left().evaluate() / right().evaluate();
    }
}
