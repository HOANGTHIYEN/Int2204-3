package lab8;

public abstract class BinaryExpression extends Expression{
	Expression left;
	Expression right;
	
	public Expression left() {
		return left;
		
	}
	public Expression right() {
		return right;
		
	}
	
	public BinaryExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}
	@Override
	public abstract String toString();
		// TODO Auto-generated method stub
		
	
	@Override
	public abstract int evaluate();
		// TODO Auto-generated method stub
		
	
	
		
	

}
