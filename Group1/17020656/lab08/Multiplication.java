/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

/**
 *
 * @author Admin
 */
public class Multiplication extends BinaryExpression{
    Expression left;
    Expression right;
    public Multiplication(Expression left, Expression right) {
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
        return left.toString() + "*" + right.toString();
    }
    @Override
    public int evaluate() {
        return (this.left.evaluate())*(this.right.evaluate());
    }
}
