/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Administrator
 */
public class Numeral extends Expression{
    int value;

    
    
    public  Numeral()
    {    this.value=55;   
    }
    public  Numeral(int value)
    {   this.value=value;
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
     return " "+value+" ";  
    }
    
}
