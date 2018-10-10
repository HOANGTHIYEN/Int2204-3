/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap05.shape;

/**
 *
 * @author Nguyen Thai
 */
public class Square extends Rectangle{
    public double side = 4;
    public double width;
    public double length;

    public double getWidth() {
        return width;
    }


    public double getLength() {
        return length;
    }  

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public Square(){
        
    }
    
    public Square(double side)
    {
        super(side , side);
        this.side = side;
    }
    
    public Square(double side , String color , boolean filled)
    {
        super(color , filled , side, side);
        this.side = side;
    }
    @Override
    public void setWidth( double side)
    {
        this.width= side;
        this.length = side;
    }
    
    @Override
    public void setLength( double side)
    {
        this.width= side;
        this.length = side;
    }
    

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

    
    
}
