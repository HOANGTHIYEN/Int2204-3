/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Quoc
 */
public class Square extends Rectangle{
    double side;
    public Square(){
        
    }
    public Square(double side){
        super(side, side);
        this.side=side;
    }
    public Square(double side,String color,boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
        this.width=side;
        this.length=side;
    }
    @Override
    public void setWidth(double side){
        this.width=side;
    }
    @Override
    public void setLength(double side){
        this.length=side;
    }
    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
}
