package Ex1;

public class Numeral extends Expression {
    private int value;
    /**
     * constructor
     */
    public Numeral(){};

    public Numeral(int val)
    {
        value = val;
    }
    
    @Override
    public String toString() {
        return ""+value;
    }
    
    @Override
    public int evaluate() {
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
