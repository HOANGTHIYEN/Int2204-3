/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05t2;
 class shape
{
    private String color;
    private boolean filled;

    public shape() {
        this.color = "red";
        this.filled = true;
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return color + " " + filled;
    }

}

class Circle extends shape {

     private double radius;
    private double PI=3.14;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area;
        area=radius*radius*PI;
        return area;
    }
    public double getPerimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return  radius +" "+getArea()+" "+getPerimeter() ;
    }

}

class rectangle extends shape {

    double width, length, area, perimeter;

    public rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
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

    public double getArea() {
        area=width*length;
        return area;
    }

    public double getPerimeter() {
        perimeter=2*width+2*length;
        return perimeter;
    }

    @Override
    public String toString() {
        return width + " " + length + " " + getArea() + " " + getPerimeter();

    }

}

class square extends rectangle {

  

    public square() {
         super();
    }

    public square(double side) {
        super(side,side);
        
    }

    public square(double side, String color, boolean filled) {
        super(side,side,color,filled);
        
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }
    
    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }
     @Override
    public void setLength(double length) {
        this.setSide(length);
    }
    @Override
    public String toString() {
        return length + " "+getArea()+" "+getPerimeter();

    }

    
}

class lab05t2 {

    public static void main(String[] args) {
        square s1 = new square(5.0);
        System.out.println(s1.toString());
    }
}