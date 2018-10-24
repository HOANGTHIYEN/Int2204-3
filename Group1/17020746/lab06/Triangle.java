package lb6;

public class Triangle extends Shape {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //Constructor
    public Triangle() {

    }

    public Triangle(double a, double b, double c, int x, int y, int moveX, int moveY, String color, boolean filled, boolean pos) {
        super(x, y, moveX, moveY, color, filled, pos);
        this.a = a;
        this.b = b;
        this.c = c;
        name = "Triangle";
    }

    public String toString(){
        return super.toString() + "a = " + a + " b = " + b + "c = " + c;
    }

}
