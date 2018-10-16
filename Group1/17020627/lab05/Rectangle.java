package bai2tuan5;

public class Rectangle extends Shape{
    protected double width, length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
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
    
    public double getPerimeter() {
        return 2*(width + length);
    }

    public double getArea() {
        return width*length;
    }

   
    @Override
    public String toString() {
        return "Rectangle{    " + "chieurong=" + width + " , chieudai=" + length + 
                " , Chuvi=" + 2*(width + length) + " , S= " + width*length + '}';
    }
    
}
