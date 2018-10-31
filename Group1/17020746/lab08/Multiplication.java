package lb8;

public class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public Expression left(){
        return left;
    }

    public Expression right(){
        return right;
    }

    public String toString() {
        return (left.toString() + " x " + right.toString());
    }

    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
