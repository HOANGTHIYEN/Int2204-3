/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import static java.lang.Math.sqrt;

class Triangle extends Shape{
    double a, b, c;
    public Location[] L = new Location[3];
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
       
    }
    public Triangle(double c1, double c2, double c3, String color, boolean filled, Location tam) {
        super(color, filled, tam);
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

    @Override
    public void showInfo() {
        System.out.println("Tam giác" + "\n" + a + "n" + b + "\n" + c +  "\n" + color + "\n" + filled + "\n"+ mid.getX() + "\n"+mid.getY());
    }
}