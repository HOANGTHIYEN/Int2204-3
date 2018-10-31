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
public class Division extends Expression{
    Expression left3;
    Expression right3;
    
    public  Division (Expression left3,Expression right3) 
    {   
        this.left3=left3;
        this.right3=right3;
    }
    
    @Override
    public int evaluate() {
       return this.left3.evaluate()/this.right3.evaluate();
    }

    @Override
    public String toString() {
      return left3.toString() + " / " + right3.toString(); 
    }
    
}


    

