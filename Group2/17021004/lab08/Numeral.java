/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Hoangson
 */
//class Numeral ke thua class Expresion
public class Numeral extends Expression {
    int value;
    
    //constructor
    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }
    
    //getter setter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }


    @Override
    public int evaluate() {
        return value;
    }
    
}
