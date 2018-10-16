/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_06;

import static java.lang.Math.sqrt;

/**
 *
 * @author Admin
 */
class Triangle extends Shape{
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
    public double getArea(){
        double p = (c1 + c2 + c3)/2;
        return sqrt(p*(p - c1)*(p - c2)*(p - c3));
    }
    public double getPerimeter(){
        return (c1 + c2 + c3);
    }
    public void info(){
        System.out.println("Hinh tam giac: " + c1 + " " + c2 + " " + c3+" "+color+" "+filled+"  "+tam);
    }
}
    
