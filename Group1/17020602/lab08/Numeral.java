
package w8;


public class Numeral extends Expression {
    int value;
    public Numeral()
    {
        this.value=1;
    }
      public Numeral(int value)
    {
        this.value=value;
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
