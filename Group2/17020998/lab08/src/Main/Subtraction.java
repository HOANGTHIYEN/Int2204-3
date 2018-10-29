package Main;

public class Subtraction extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Subtraction(Expression l, Expression r){
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
        return this.left.evaluate() - this.right.evaluate();
    }

    @Override
    public String toString() {
        return "Subtraction{" +
                "left=" + left +
                ", right=" + right +
                '}' +
                "equals= " + evaluate();
    }
}
