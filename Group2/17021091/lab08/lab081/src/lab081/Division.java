/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab081;

/**
 *
 * @author Genius
 */
public class Division extends BinaryExpression{
    Expression left, right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int evaluate() throws ArithmeticException{
        if(right.evaluate() == 0)
            throw new ArithmeticException("Lỗi chia cho 0");
        return (left.evaluate() / right.evaluate());
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }
    @Override
    public String toString() {
        return left.toString() + " : " + right.toString();
    }
}
