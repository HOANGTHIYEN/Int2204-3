package lab_08;

public class Numeral extends Expression {
    int value;


    public Numeral(int value) {
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
