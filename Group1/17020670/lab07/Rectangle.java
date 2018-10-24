/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rectangle extends Shape {

    protected toaDo A;
    protected toaDo B;
    protected toaDo C;
    protected toaDo D;

    public Rectangle() {
        super();
    }

    public Rectangle(toaDo a, toaDo b, toaDo c, toaDo d) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }

    public Rectangle(toaDo a, toaDo b, toaDo c, toaDo d, String color, boolean filled, toaDo Tam) {
        super(color, filled, Tam);       //tham chiếu trực tiếp đến biến instance của lớp cha.
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }

    public toaDo getA() {
        return this.A;
    }

    public void setA(toaDo a) {
        this.A = a;
    }

    public toaDo getB() {
        return this.B;
    }

    public void setB(toaDo b) {
        this.B = b;
    }

    public toaDo getC() {
        return this.C;
    }

    public void setC(toaDo c) {
        this.C = c;
    }

    public toaDo getD() {
        return this.D;
    }

    public void setD(toaDo d) {
        this.D = d;
    }

    public double getW() {
        return sqrt(pow((this.A.getX() - this.B.getX()), 2) + pow((this.A.getY() - this.B.getY()), 2));
    }

    public double getL() {
        return sqrt(pow((this.A.getX() - this.C.getX()), 2) + pow((this.A.getY() - this.C.getY()), 2));
    }

    public double getArea() {
        return this.getL() * this.getW();
    }

    public double getPerimeter() {
        return 2 * (this.getL() + this.getW());
    }

    public void getinfo() {
        System.out.println("Rectangle  S = " + this.getArea() + "    C = " + this.getPerimeter());
    }

    public void Move(toaDo a, toaDo b, toaDo c, toaDo d) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.setD(d);
    }

    public void toaDoDiem() {
        System.out.println(this.A.getX() + " ; " + this.A.getY() + "\t\t" + this.B.getX() + " ; " + this.B.getY() + "\t\t" + this.C.getX() + " ; " + this.C.getY() + "\t\t" + this.D.getX() + " ; " + this.D.getY() + "\t\t");
    }

   
}
