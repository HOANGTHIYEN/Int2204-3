package lab8;
public class Addition extends BinaryExpression{
	private Expression left;
	private Expression right;

	//Set/Get
	public void setLeft(Expression left) {
		this.left = left;
	}

	public void setRight(Expression right) {
		this.right = right;
	}
	
	//constructor
	public Addition(Expression l, Expression r) {
		left = l;
		right = r;
	}
	
	@Override
	public Expression left() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public Expression right() {
		// TODO Auto-generated method stub
		return right;
	}

	@Override
	public String toString() {
		return left.evaluate() +" + "+ right.evaluate();
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		
		return left.evaluate()+right.evaluate();
	}

	
	

}