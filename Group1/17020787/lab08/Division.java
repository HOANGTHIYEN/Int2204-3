package lap8_1;

public class Division extends BinaryExpression {
    Expression left, right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        try {
            return (left.evaluate() / right.evaluate());
        } catch (ArithmeticException ar){
            System.out.println(ar.getMessage());
            return -1;
        }
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
        return left.toString() + " /" + right.toString();
    }
}
