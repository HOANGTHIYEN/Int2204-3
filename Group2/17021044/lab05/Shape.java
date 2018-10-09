/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import javafx.geometry.Side;

/**
 *
 * @author Admin
 */
public class Shape {
    
    public String color;
    boolean filled;
    public Shape() {
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filled)
    {
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
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
}
    class circle extends Shape{
        double radius;
        double PI = 3.14;

    public circle() {
        radius = 1.0;
    }
    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public circle(double radius) {
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
        area = radius*radius*PI;
        return area;
    }
    public double getPerimeter(){
        double Perimeter;
        Perimeter = 2*radius*PI;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + '}';
    }
    }
class rectangle extends Shape{
    double width;
    double length;
    public rectangle(){
        width = 1.0;
        length = 1.0;
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
    public double getArea(){
        double area;
        area = width*length;
        return area;
    }
    public double getPerimeter(){
        double perimeter;
        perimeter = width*length;
        return perimeter;
    }

    @Override
    public String toString() {
        return "rectangle{" + "width=" + width + ", length=" + length + '}';
    }

    
}
class Square extends rectangle{
    double side;
    public Square(){
        side = 0;
    }

    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public void square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    
}
