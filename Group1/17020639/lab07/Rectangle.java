
package Javaapllication4;
import java.awt.Color;
public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle() {
    }
 
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, int x, int y, boolean filled, boolean visible, Color color) {
        super(filled, visible, color, x, y);
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
        return "Rectangle{" + "width=" + width + ", length=" + length + ", filled=" + filled  + ", color=" + color + '}';
    }
}
