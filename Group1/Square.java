package com.lab07.bai01;

public class Square extends Expression {
	private Expression expression;

	public Square(Expression expression) {
		super();
		this.expression = expression;
	}

	//@Override
	public String toString() {

		return expression.toString()+"^2";
	}
	//@Override
	public String toString(Expression expression) {
		return "("+expression.toString()+")^2";  
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	//@Override
	public int evaluate() {
       
		return expression.evaluate()*expression.evaluate();
	}

}
