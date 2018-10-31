package lab8;

import java.util.Arrays;

public class Square extends Expression{
	private Expression expression;

	

	public Square(Expression expression) {
		super();
		this.expression = expression;
	}



	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	public int Square(Expression expression) {
		return  expression.evaluate();
	}
	
	@Override
	public String toString() {
		 return "("+expression.evaluate() + "^2)" ;
	}

	@Override
	public int evaluate() {
		return  expression.evaluate()*expression.evaluate();
	}
	
}
