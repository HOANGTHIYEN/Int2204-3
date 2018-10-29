
package lab7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Triangle extends Shape {

    protected toaDo A, B, C;

    protected Triangle() {
        super();
    }

    public Triangle(toaDo A, toaDo B, toaDo C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Triangle(toaDo a, toaDo b, toaDo c, String color, boolean filled, toaDo Tam) {
        super(color, filled, Tam);
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public toaDo getA() {
        return A;
    }

    public void setA(toaDo A) {
        this.A.setX(A.getX());
        this.A.setY(A.getY());
    }

    public toaDo get() {
        return B;
    }

    public void setB(toaDo B) {
        this.B.setX(B.getX());
        this.B.setY(B.getY());
    }

    public toaDo getC() {
        return C;
    }

    public void setC(toaDo C) {
        this.C.setX(C.getX());
        this.C.setY(C.getY());
    }

    public double canh1() {
        return sqrt(pow((this.A.getX() - this.B.getX()), 2) + pow((this.A.getY() - this.B.getY()), 2));
    }

    public double canh2() {
        return sqrt(pow((this.C.getX() - this.B.getX()), 2) + pow((this.C.getY() - this.B.getY()), 2));
    }

    public double canh3() {
        return sqrt(pow((this.A.getX() - this.C.getX()), 2) + pow((this.A.getY() - this.C.getY()), 2));
    }

    public double getArea() {
        double p = (this.canh1() + this.canh2() + this.canh3()) / 2;
        return sqrt(p * (p - this.canh1()) * (p - this.canh2()) * (p - this.canh3()));
    }

    public double getPerimeter() {
        return (this.canh1() + this.canh2() + this.canh3());
    }

    public void getinfo() {
        System.out.println("Tritangle  S = " + this.getArea() + "    C = " + this.getPerimeter());
    }

    public void toaDoDiem() {
        System.out.println(this.A.getX() + " ; " + this.A.getY() + "\t\t" + this.B.getX() + " ; " + this.B.getY() + "\t\t" + this.C.getX() + " ; " + this.C.getY() + "\t\t");
    }

    public void Move(toaDo a, toaDo b, toaDo c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);

    }

   
}
