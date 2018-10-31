package lab8;

import java.util.Objects;

public class Addition extends BinaryExpression {
    Expression left;
    Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    Expression left() {
        return left;
    }

    @Override
    Expression right() {
        return right;
    }

    @Override
    int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String toString() {
        return "("+left.toString() + "+" +right.toString()+")";
    }
}
