/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangl8;

/**
 *
 * @author thang
 */
public  class Addtion extends BinaryExpression{
    Expression left;
    Expression right;
    public Addtion(Expression left,Expression right)
    {  this.left=left;
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
            return left.evaluate()+right.evaluate();
    }

    @Override
    public String toString() {
        return left+ "+" +right;
    }

    @Override
    public Expression rights() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
