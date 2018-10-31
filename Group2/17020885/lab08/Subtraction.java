/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author dell
 */
public class Subtraction extends Expression{
    Expression ex;
    Expression ex1;
    public  Subtraction (Expression ex,Expression ex1) 
    {   
        this.ex=ex;
        this.ex1=ex1;
    }
    @Override
    public int evaluate() {
       return this.ex.evaluate()-this.ex1.evaluate();
    }

    @Override
    public String toString() {
      return ex + " - " + ex1; 
    }
    
}