package Ex1;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;
    
    public BinaryExpression(Expression l, Expression r) {
        left = l;
        right = r;
    }
    public Expression getLeft() { return left; }
    public Expression getRight() { return right; }
    
    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public abstract String toString();
   
    @Override
    public abstract int evaluate();
}
