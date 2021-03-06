package lab08;

public class Division extends BinaryExpression {
	

    public Division(Expression l,Expression r){
        super(l,r);
    }
    @Override
    public String toString() {
        return String.format( "%s/%s",left,right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
