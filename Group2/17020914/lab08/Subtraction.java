/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author admin
 */
public class Subtraction extends BinaryExpression{
    public Subtraction(Expression a, Expression b) {
        super(a, b);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
