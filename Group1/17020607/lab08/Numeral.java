package week8;

public class Numeral extends Expression {

    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
        //Emty
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
