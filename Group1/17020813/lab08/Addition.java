
package lab8;

public class Addition extends BinaryExpression {
    Expression left;
    Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
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
        return (left.toString()+" + "+right.toString());
    }

    @Override
    public int evaluate() {
        return (left.evaluate()  + right.evaluate());
    }
}

