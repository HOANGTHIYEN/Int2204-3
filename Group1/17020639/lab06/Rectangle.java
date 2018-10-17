
package Javaapllication4;

public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle() {
    }
 
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, int x, int y, boolean filled, String color) {
        super(x, y, filled, color);
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
        return "Rectangle{" + "width=" + width + ", length=" + length + ", x=" + x + ", y=" + y + ", filled=" + filled  + ", color=" + color + '}';
    }
}
