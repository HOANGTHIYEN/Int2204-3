/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1lab08;

/**
 *
 * @author Quoc
 */
public class Square extends Expression{
    Expression expression;
    public Square(Expression expression)
    {   
        this.expression=expression;
    }
    @Override
    public int evaluate() {
        return  (this.expression.evaluate())*(this.expression.evaluate());
    }
    @Override
    public String toString() {
        return "(" + expression + ")"+"^2"; 
    }  
}