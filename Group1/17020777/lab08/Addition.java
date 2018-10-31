package Ex1;

public class Addition extends BinaryExpression {
   
    public Addition(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String toString() {
        return ""+left+"+"+right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
