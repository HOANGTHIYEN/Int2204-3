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
public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
     public Rectangle(double width, double length, String color, boolean filled, Toadodiem td) {
        super(color, filled, td);
        this.width = width;
        this.length = length;
    }
     public double getWidth() {
        return width;
    }
     public void setWidth(double width) {
        this.width = width;
    }
     public double getLength() {
        return length;
    }
     public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width + length)*2;
    }
    public void Xuat(){
        System.out.println("Hinh chu nhat có: " +" chieu dai : "+ length + " chieu rong : " + width +" Mau : "+color+" Filled :  "+filled+" "+td);
    }
    //câc hinh chu nhat giong nhau
    @Override
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
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        return true;
    }
}
