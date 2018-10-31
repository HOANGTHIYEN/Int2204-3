package lab08;

public class Numeral extends Expression {
	private int value;

    public Numeral() { this(0); }
    public Numeral(int v) { value = v; }

    @Override
    public String toString() {
        return String.format("%d", value);
    }

    @Override
    public int evaluate() {
        return value;
    }
	
}
