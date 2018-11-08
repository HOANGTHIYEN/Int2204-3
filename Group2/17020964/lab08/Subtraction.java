package lab8;

public class Subtraction extends BinaryExpression{

	public Subtraction(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s-%s",left,right);
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return left.evaluate()+right.evaluate();
	}

}
