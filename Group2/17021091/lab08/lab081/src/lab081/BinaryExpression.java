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
abstract class BinaryExpression extends Expression{
    
    @Override
    abstract public int evaluate();
    abstract public Expression left();
    abstract public Expression right();
}
