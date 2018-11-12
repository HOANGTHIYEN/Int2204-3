/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08cau2;

public class Square extends Expression {
    
    Expression Ex;
    
    public Square(Expression Ex) {
        this.Ex = Ex;
    }
    
    @Override
    public int evaluate(){
        return Ex.evaluate()*Ex.evaluate();
    }

    @Override
    public String toString() {
    	return Ex.toString() + "^2";
    }
}
