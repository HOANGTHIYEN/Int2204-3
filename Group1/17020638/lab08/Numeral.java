package lab8;

public class Numeral extends Expression {
    int value;
    
    public Numeral(){
        
    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
    int evaluate() {
        return value;
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
