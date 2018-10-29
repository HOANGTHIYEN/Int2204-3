/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled, Location mid) {
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
    public void showInfo(){
        System.out.println("Hình chữ nhật"+"\n " + width + "\n" + length + "\n" + color + "\n" + filled + "\n" + mid );
    }


}
