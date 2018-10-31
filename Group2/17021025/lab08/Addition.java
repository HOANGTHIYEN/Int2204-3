public class Addition extends BinaryExpression{

    protected Expression left, right;
    public Addition() {

    }

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return (left.evaluate() + right.evaluate());
    }

    @Override
    public Expression left() {


        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}
