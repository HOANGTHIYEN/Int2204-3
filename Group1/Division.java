package com.lab07.bai01;

public  class Division extends BinaryExpression {
	private Expression left;
	private Expression right;
	public Expression getLeft() {
		return left;
	}
	public void setLeft(Expression left) {
		this.left = left;
	}
	public Expression getRight() {
		return right;
	}
	public void setRight(Expression right) {
		this.right = right;
	}
	public Division(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}
	public Division() {
		
	}
	public String toString() {
		return left.toString()+ " / " +right.toString();
				
	}
	public int evaluate() {
		return  left.evaluate()/right.evaluate();
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
}
