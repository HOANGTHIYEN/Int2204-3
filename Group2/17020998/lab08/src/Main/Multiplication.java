package Main;

public class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Multiplication(Expression l, Expression r){
        this.left = l;
        this.right = r;
    }

    @Override
    public Expression left(){
        return this.left;
    }

    public Expression right(){
        return this.right;
    }

    @Override
    public int evaluate(){
        return this.right.evaluate()*this.left.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + "*" + right.toString();
    }
}
