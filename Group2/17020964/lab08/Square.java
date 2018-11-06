package lab8;

public class Square extends Expression{
	private Expression expression;

	public Square(Expression expression) {
		super();
		this.expression = expression;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%s)^2",expression);
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return expression.evaluate()*expression.evaluate();
	}
	

}
