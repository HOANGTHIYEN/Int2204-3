package lab6;

import static java.lang.Math.sqrt;
import java.util.Vector;

/**
 *
 * @author Việt Hoàng
 */
class Diagram extends Vector<Layer> {

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }

    public void eraseCricle() {
        for (int j = 0; j < this.size(); j++) {
            for (int k = 0; k < this.elementAt(j).size(); k++) {
                if (this.elementAt(j).elementAt(k) instanceof Cricle) {
                    this.elementAt(j).remove(k);
                    k--;
                }
            }
        }
    }
}
class Layer extends Vector<Shape> {

    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }

    public void eraseTriangle() {
        for (int j = 0; j < this.size(); j++) {
            if (this.elementAt(j) instanceof Triangle) {
                this.remove(j);
                j--;
            }
        }
    }
}
class Toado {

    private double x, y;

    public Toado() {
    }

    public Toado(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}

class Shape {

    public String color;
    public boolean filled;
    public Toado tam;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled, Toado tam) {
        this.color = color;
        this.filled = filled;
        this.tam = tam;
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

    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }

    public void diChuyen(double dodai, String huong) {
        switch (huong) {
            case "bac":
                tam.setY(tam.getY() + dodai);
                break;
            case "nam":
                tam.setY(tam.getY() - dodai);
                break;
            case "dong":
                tam.setX(tam.getX() + dodai);
                break;
            case "tay":
                tam.setX(tam.getX() - dodai);
                break;
            default:
                break;
        }
    }

    public void info() {
        System.out.println("");
    }
}



class Cricle extends Shape {

    public double radius;
    final double pi = 3.14;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * pi;
    }

    public double getPerimeter() {
        return 2 * radius * pi;
    }

    public void info() {
        System.out.println(" hinh tron\n" + radius);
    }
}

class Rectangle extends Shape {

    protected double width, length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
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
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public void info() {
        System.out.println(" hinh chu nhat\n " + length + " " + width);
    }
}

class Triangle extends Shape {

    protected double c1, c2, c3;
    protected Toado[] tg = new Toado[3];

    public Triangle() {
    }

    public Triangle(double c1, double c2, double c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Triangle(double c1, double c2, double c3, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public double getArea() {
        double p = (c1 + c2 + c3) / 2;
        return sqrt(p * (p - c1) * (p - c2) * (p - c3));
    }

    public double getPerimeter() {
        return (c1 + c2 + c3);
    }

    public void info() {
        System.out.println(" hinh tam giac:\n " + c1 + " " + c2 + " " + c3);
    }
}

class Square extends Rectangle {

    public double side;

    public Square() {

    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled, Toado tam) {
        super(side, side, color, filled, tam);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }

    public void setWidth(double width) {
        this.width = width;
        this.side = width;
        this.length = width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
        this.side = length;
    }

    public void info() {
        System.out.println(" hinh vuong\n " + side);
    }
}

public class Lab6 {

    public static void main(String[] args) {

        Diagram d = new Diagram();

        Layer d1 = new Layer();
        d1.add(new Triangle(3, 4, 5));
        d1.add(new Cricle(3));
        d1.add(new Rectangle(4, 5));
        d1.add(new Square(5));
        for (int j = 0; j < d1.size(); j++) {
            d1.elementAt(j).info();
        }
        d1.eraseTriangle();
        System.out.println("\n xoa hinh tam giac: \n");
        for (int j = 0; j < d1.size(); j++) {
            d1.elementAt(j).info();
        }
        d.add(d1);
        Layer d2 = new Layer();
        d2.add(new Cricle(3));
        d2.add(new Cricle(2));
        d2.add(new Triangle(3, 5, 2.5));
        d.add(d2);

        d.eraseCricle();
        System.out.println("\n xoa hinh tron:\n");
        for (int j = 0; j < d.size(); j++) {
            for (int k = 0; k < d.elementAt(j).size(); k++) {
                d.elementAt(j).elementAt(k).info();
            }
            System.out.println(" ");
        }
    }

}
