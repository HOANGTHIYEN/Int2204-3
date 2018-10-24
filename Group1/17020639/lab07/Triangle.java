
package Javaapllication4;
import java.awt.Color;
public class Triangle extends Shape{
    protected int[] x=new int [3];
    protected int[] y=new int [3];

    public Triangle() {
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x[0] =x1;
	this.x[1] = x2;
	this.x[2] = x3;
	this.y[0] = y1;
	this.y[1] = y2;
	this.y[2] = y3;

    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3 , boolean filled, boolean visible, Color color, int x, int y) {
        super(filled, visible, color, x, y);
         this.x[0] =x1;
	this.x[1] = x2;
	this.x[2] = x3;
	this.y[0] = y1;
	this.y[1] = y2;
	this.y[2] = y3;
    }

    public int[] getTriangleX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getTriangleY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Triangle{" + "x1=" + x[0] + ", y1=" + y[0] + ", x2=" + x[1] + ", y2=" + y[1] + ", x3=" + x[2] + ", y3=" + y[2] + '}';
    }

 
}
