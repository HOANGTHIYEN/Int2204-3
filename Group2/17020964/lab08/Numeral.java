package lab8;

public class Numeral extends Expression{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Numeral(int value) {
		super();
		this.value = value;
	}
	public Numeral() {
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d", value);
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return value;
	}
	

}
