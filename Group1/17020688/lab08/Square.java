/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

public class Square extends Expression{
  Expression expression;
  public Square(Expression expression)
  {
      this.expression=expression;
  }
  public void setex(Expression expression)
  {
      this.expression=expression;
      
  }
 

    

  @Override
    public String toString()
    {
        return null;
    }

    @Override
    public int evaluate() {
       return expression.evaluate()*expression.evaluate();
    }
  
}