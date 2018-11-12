package JavaApplication8;

public class Numeral extends Expression{

    int value;

    public Numeral() {
        this.value=7;
    }

    public Numeral(int value) {
        this.value = value;
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