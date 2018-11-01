package expression;

public class Square extends Expression{
	private Expression expression;

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	public Square(Expression _expression) {
		expression = _expression;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(this.expression instanceof Numeral) {
			return expression.toString()+ "^2 ";
		}
		
		
		return "(" + this.expression.toString() +")^2 ";
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return expression.evaluate() * expression.evaluate();
	}
	
	
	
	
}