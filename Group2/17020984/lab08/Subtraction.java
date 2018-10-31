public class Subtraction extends BinaryExpression {
    private Expression left;
    private Expression right;

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    public Subtraction(Expression value1, Expression value2){
        this.left = value1;
        this.right = value2;
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.evaluate() + ")";
    }
}
