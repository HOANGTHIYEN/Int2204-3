
package javaapplication3;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color, boolean flied) {
        super.setColor(color);
        super.setFlied(flied);
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

    @Override
    public String toString() {
        return super.toString()+"Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    public double getArea()
    {
        return 2*(length+width);
    }
    public double getPerimeter()
    {
        return length*width;
    }
}
