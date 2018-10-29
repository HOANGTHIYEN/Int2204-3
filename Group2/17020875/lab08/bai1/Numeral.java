package bai1;

public class Numeral extends Expression{

    protected int value;
    public Numeral(){}

     public int getValue() {
         return value;
     }

     public void setValue(int value) {
         this.value = value;
     }

     public Numeral(int value)
     {
         this.value = value;
     }

     @Override
     public String toString() {
         return value + "";
     }

     @Override
     public int evaluate() {
         return getValue();
     }
 }
