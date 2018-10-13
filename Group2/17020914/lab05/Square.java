/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author admin
 */
public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double s){
       super(s,s);
    }
    public Square(double s, String n, boolean i){
        super(s,s,n,i);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double s){
        super.setWidth(s);
        super.setLength(s);
    }
    public void setWidth(double s){
        this.setSide(s);
    }
    public void setLength(double s){
        this.setSide(s);
    }
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    } 
}
