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
public class Multiplication extends Expression{
    Expression left2;
    Expression right2;
    public  Multiplication (Expression left2,Expression right2) 
    {   this.left2=left2;
        this.right2=right2;
    }
    @Override
    public int evaluate() {
       return this.left2.evaluate() * this.right2.evaluate();
    }

    @Override
    public String toString() {
      return left2.toString()+ right2.toString(); 
    }
    
}



    

