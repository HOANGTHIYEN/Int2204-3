public class Multiplication extends BinaryExpression{
    public Expression left;
    public Expression right;

    @Override
    public Expression left(){
        return left;
    }
    public void setLeft(Expression left){
        this.left = left;
    }

    @Override
    public Expression right(){
        return right;
    }
    public void setRight(Expression right){
        this.right = right;
    }

    public Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }
}
