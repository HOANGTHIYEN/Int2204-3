/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08.pkg1;

/**
 *
 * @author Dell
 */
public class Division extends Expression{
    Expression a;
    Expression b;
    public  Division (Expression a,Expression b) 
    {   this.a=a;
        this.b=b;
    }
    @Override
    public int evaluate() {
       return (this.a.evaluate()/this.b.evaluate());
    }
     @Override
    public String toString() {
      return a + "/" + b; 
    }
    
}
