package lab08;

public class Subtraction extends BinaryExpression {
	
    public Subtraction(Expression l,Expression r){
        super(l,r);
    }
    @Override
    public String toString() {
        return String.format("%s - %s", left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
