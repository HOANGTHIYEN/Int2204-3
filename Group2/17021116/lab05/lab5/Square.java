/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 123456789
 */
public class Square extends Rectangle{
    public Square(){};
    double side;
    public Square(double side){
        super(side,side);
        this.side = side;
    }
    public Square(double side, String color,boolean filled){
        super(side,side,color,filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        super.width = side;
        super.length = side;
    }

    /**
     *
     * @param side
     */
    @Override
    public void setWidth(double side){
        super.width = side;
        super.length = side;
    }
    @Override
    public void setLength(double side){
        super.length = side;
        super.width = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
}

