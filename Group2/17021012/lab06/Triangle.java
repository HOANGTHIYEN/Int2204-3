package bai_tap_lap06;

import static java.lang.Math.sqrt;;


public class Triangle extends Shape{
	protected double a, b, c;
    //protected Toadodiem[] tg = new Toadodiem[3];

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b, double c, String color, boolean filled, Toadodiem td) {
        super(color, filled, td);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
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
    public double getArea(){
        double p = (a + b + c)/2;
        return sqrt(p*(p - a)*(p - b)*(p - c));
    }
    
	public double getPerimeter(){
        return (a + b + c);
    }
    public void info(){
        System.out.println("Hinh tam giac: " + a + " " + b + " " + c  +" "+color+" "+filled+"  "+td);
    }
}
    