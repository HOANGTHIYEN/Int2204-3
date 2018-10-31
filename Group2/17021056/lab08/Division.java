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
public class Division extends Expression{
    Expression expression;
    Expression expression1;
    public  Division (Expression expression,Expression expression1) 
    {   this.expression=expression;
        this.expression1=expression1;
    }
    @Override
    public int evaluate() {
       return (this.expression.evaluate())/(this.expression1.evaluate());
    }

    @Override
    public String toString() {
      return  expression + " / " + expression1; 
    }
    
}
