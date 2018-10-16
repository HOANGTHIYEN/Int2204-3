/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05bai2;

/**
 *
 * @author Dell
 */
public class square extends rectangle {
   protected double side;
    public square()
    {
        
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        super.width=side;
        super.length=side;
    }
    public square(double side)
    {
        super(side,side);
        this.side=side;
        
    }
    public square(double side,String mausac,boolean filled)
    {
        super(side,side,mausac,filled);
        this.side=side;
    }
    public void setWidth(double side)
    {
        super.width=side;
        super.length=side;
    }
    public void setLength(double side)
    {
        super.width=side;
        super.length=side;
    }
    public String toString()
    {
        return "side"+side;
    }
    
    
}
