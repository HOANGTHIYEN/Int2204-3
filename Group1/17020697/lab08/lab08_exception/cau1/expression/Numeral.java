package expression;

public  class Numeral extends Expression {
	private int value;

	
	//get/set
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	//Constructor
	public Numeral(int value) {
		super();
		this.value = value;
	}
	public Numeral() {
		super();
		this.value = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value+" ";
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return value;
	}

}