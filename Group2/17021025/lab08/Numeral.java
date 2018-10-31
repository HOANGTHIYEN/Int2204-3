public class Numeral extends Expression {
    private int value;

    public Numeral(int value){
        this.value=value;
    }
    public Numeral(){

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  getValue()+ " ";
    }

    @Override
    public int evaluate() {
        return getValue();
    }
}
