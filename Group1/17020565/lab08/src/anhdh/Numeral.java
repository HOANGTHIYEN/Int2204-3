package anhdh;

public class Numeral extends Expression {
    private int value;

    //Constructor
    public Numeral() {

    }

    public Numeral(int value) {
        this.value = value;
    }

    //setter, getter
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int evaluate() {
        return getValue();
    }

}
