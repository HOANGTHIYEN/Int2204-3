/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap8cau1;

/**
 *
 * @author Nguyễn Thái
 */
public class Numerral extends Expression{
   
    int value;

    public  Numerral()
    {    
        this.value=28;   
    }
    public  Numerral(int value)
    {   
        this.value=value;
    }
    public int getValue() 
    {
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
     return "" + value;  
    }
    
}

    

