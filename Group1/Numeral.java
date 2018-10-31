package com.lab07.bai01;

public class Numeral extends Expression {
	private int value;
	public Numeral() {}

	public Numeral(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return Integer.toString(value);
	}
	@Override
	public int evaluate() {
		return value;
	}


}
