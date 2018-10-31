/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap07;

/**
 *
 * @author Nguyễn Thái
 */
public class Square extends Rectangle{
    protected double side;
    public Square(){
        
    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }    
     public Square(double side, String color, boolean filled, Toadodiem td) {
        super(side, side, color, filled, td);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
     public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.side = width;
        this.length = width;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
        this.side = length;
    }
    public void Xuat(){
        System.out.println("Hinh vuong: " + side+" "+color+" "+filled+" "+td);
    };
    @Override
//so sanh hai hinh vuong
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Square other = (Square) obj;
        if (Double.doubleToLongBits(this.side) != Double.doubleToLongBits(other.side)) {
            return false;
        }
        return true;
    }
}
