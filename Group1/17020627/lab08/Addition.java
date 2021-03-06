package tuan8;



public class Addition extends BinaryExpression {
	Expression left, right;
	
	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public Addition() {}
		

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
		return (left.toString() + " + " + right.toString());
	}

	@Override
	public int evaluate() {
		return (left.evaluate() + right.evaluate());
	}
	
	
	
}

