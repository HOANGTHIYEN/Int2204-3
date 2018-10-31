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
public class Subtraction extends Expression{
    Expression left1;
    Expression right1;
    public  Subtraction (Expression left1,Expression right1) 
    {  
        this.left1=left1;
        this.right1=right1;
    }
    @Override
    public int evaluate() {
       return this.left1.evaluate() - this.right1.evaluate();
    }

    @Override
    public String toString() {
      return left1.toString() + " - " + right1.toString(); 
    }  
    
}


