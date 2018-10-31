package community.com;

public class Numeral extends Expression {
	private int value ;

	public Numeral(int value) {
		super();
		this.value = value;
	}

	public Numeral() {
		super();
	}
	public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

	

}
