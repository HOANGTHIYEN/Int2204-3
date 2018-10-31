/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

/**
 *
 * @author My PC
 */
public class tru extends BinaryExpression
{
   
      Expression left;
    Expression right;
    public void setl(Expression left)
    {
        this.left=left;
        
    }
    public void setr(Expression right)
    {
        this.right=right;
        
    }
    public Expression left()
    {
        return left;
        
    }
    public Expression right()
    {
        return right;
        
    }
    //constructor

    public tru(Expression left,Expression right) 
    {this.left=left;
    this.right=right;
        
        
        
    }
    public int evaluate()
    {
        int left;
        int right;
        if(this.left instanceof Numeral)
        {
            left=((Numeral)this.left).getValue();
            
        }
        else
        {
            left=this.left.evaluate();
        }
         if(this.right instanceof Numeral)
        {
            right=((Numeral)this.right).getValue();
            
        }
        else
        {
            right=this.right.evaluate();
        }
         return left-right;
    }
    public String toString()
    {
       return null; 
    }
    
}
