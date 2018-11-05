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
public class Addition extends BinaryExpression{
    
    Expression left;
    Expression right;
    
    public Addition(Expression left,Expression right)
    {  
       this.left=left;
       this.right=right;
    }
    
    @Override
    public Expression left() {
            return left;
    }

    public Expression right() {
            return right;
    }

    @Override
    public int evaluate() {
            return this.left.evaluate()+this.right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + right.toString();
    }

    @Override
    public Expression rights() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}



    

