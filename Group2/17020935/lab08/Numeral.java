package lab8;

public class Numeral extends Expression {
    private int value;

    public Numeral() { 
    }
    public Numeral(int value) { 
    this.value=value;
    }

    @Override
    public String toString() {
        return String.format("%d", value);
    }

    @Override
    public int evaluate() {
        return value;
    }
}
