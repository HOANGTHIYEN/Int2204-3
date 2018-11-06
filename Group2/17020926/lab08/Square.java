package lab08;

public class Square extends Expression {
	private Expression expression;
	public Square(Expression ex) {
		expression = ex;
	}
	@Override
	public String toString() {
		return String.format("(%s)^2", expression);
	}
	@Override
	public int evaluate() {
		return expression.evaluate()*expression.evaluate();
	}
}
