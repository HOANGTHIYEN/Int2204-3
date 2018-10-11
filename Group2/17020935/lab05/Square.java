/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author DELL
 */
public class Square extends Rectangle{
    private double side;
    public Square(){
        super();
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side ,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public void setWidth(double side){
        this.side=side;
    }
    public void setLength(double side){
        this.side=side;
    }
    public String toString(){
        return "Shape"+super.toString();
    }
}
