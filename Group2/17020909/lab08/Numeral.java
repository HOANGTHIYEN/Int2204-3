/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08cau2;

public class Numeral extends Expression {
    
    int value;
    
    public Numeral() {
    }
    
    public Numeral(int temp) {
        this.value = temp;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int temp) {
        this.value = temp;
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

