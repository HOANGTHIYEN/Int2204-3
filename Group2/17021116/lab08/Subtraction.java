/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author 123456789
 */
public class Subtraction extends BinaryExpression{
    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return this.left.toString() + "-" + this.right.toString();
    }

    @Override
    public int evaluate() {
        return this.left.evaluate()-this.right.evaluate();
    }
    
}
