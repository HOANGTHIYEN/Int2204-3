/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.lab06;

/**
 *
 * @author Administrator
 */
class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled, Toado td) {
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
    public void info(){
        System.out.println("Hình chữ nhật có: " +" chiều dài : "+ length + " chiều rộng : " + width +" Màu : "+color+" Filled :  "+filled+" "+td);
    }
    
}

