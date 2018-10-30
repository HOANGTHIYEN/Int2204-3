/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

/**
 *
 * @author My PC
 */
public class Numeral extends Expression
{
    int value;

    Numeral(int value) 
    { 
        super();
       this.value=value;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
            
    {
        this.value=value;
        
    }


    @Override
    public String toString() {
       return " "+ value;
    }

    @Override
    public int evaluate() {
       return value;
    }
    
}
