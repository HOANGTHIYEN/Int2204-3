package lab5;

class Shape {

    //constructor
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    //constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //function
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

    public String toString() {
        return getColor() + "\t" + isFilled();
    }
}

class Circle extends Shape {

    //constructor
    protected double radius;

    protected Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

        //new Shape(getColor(),isFilled());
    }

    //function
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    public String toString() {
        return radius + "\t" + super.toString();
    }
}

class Rectangle extends Shape {

    //constructor
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
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

    //function
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
        return 2 * (width * length);
    }

    public String toString() {
        return width + "\t" + length + "\t" + super.toString();
    }
}

class Square extends Rectangle {

    //constructor
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    //function
    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    @Override           //ghi de phuong thuc
    public String toString() {
        return width + "\t" + super.toString();
    }
}

public class bai2 {

    public static void main(String[] args) {

        Circle c1 = new Circle(4);
        System.out.println("Circle:");
        System.out.println(c1);
        System.out.println("color: " + c1.getColor());
        System.out.println("filled: " + c1.isFilled());
        System.out.println("radius: " + c1.getRadius());
        System.out.println("area: " + c1.getArea());
        System.out.println("perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(23, 26);
        System.out.println();
        System.out.println("Rectangle: ");
        System.out.println(r1);
        System.out.println("color: " + r1.getColor());
        System.out.println("filled: " + r1.isFilled());
        System.out.println("width: " + r1.getWidth());
        System.out.println("length: " + r1.getLength());
        System.out.println("area: " + r1.getArea());
        System.out.println("perimeter: " + r1.getPerimeter());

        Square s1 = new Square(6);
        System.out.println();
        System.out.println("Square: ");
        System.out.println(s1);
        System.out.println("color: " + s1.getColor());
        System.out.println("filled: " + s1.isFilled());
        System.out.println("side: " + s1.getWidth());
        System.out.println("area: " + s1.getArea());
        System.out.println("perimeter: " + s1.getPerimeter());

    }
}
