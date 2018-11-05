package lab8;

public class Addition extends BinaryExpression{
	
	
	public Addition(Expression left, Expression right) {
		super(left,right);		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s + %s",left,right);
	}
	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return left.evaluate()+right.evaluate();
	}
	

}
 