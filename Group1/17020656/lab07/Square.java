/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle{
    protected double size;
    
    public Square(double side, int x, int y, boolean filled, Color color) 
    {
        super(side, side, x, y, filled, color);
        this.size = side;
    }
    public double getSize()
    {
        return length;
    }
    public void setSize(double size)
    {
        this.length=size;   
        this.width=size;
    }
    public void setWidth(double size)
    {
        this.width=size;
        this.length=size;
    }
    public void setLength(double size)
    {
        this.width=size;
        this.length=size;
    }
}
