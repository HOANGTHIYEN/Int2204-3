/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import static java.lang.Math.sqrt;

/**
 *
 * @author MANH HOANG
 */
public class Triangle extends Shape{
    protected double c1;
    protected double c2;
    protected double c3;
    protected VitriTam[] tg = new VitriTam[3];

    public Triangle() {
    }

    public Triangle(double c1, double c2, double c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Triangle(double c1, double c2, double c3, String color, boolean filled, VitriTam vitri) {
        super(color, filled,vitri);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    /**
     * @return the c1
     */
    public double getC1() {
        return c1;
    }

    /**
     * @param c1 the c1 to set
     */
    public void setC1(double c1) {
        this.c1 = c1;
    }

    /**
     * @return the c2
     */
    public double getC2() {
        return c2;
    }

    /**
     * @param c2 the c2 to set
     */
    public void setC2(double c2) {
        this.c2 = c2;
    }

    /**
     * @return the c3
     */
    public double getC3() {
        return c3;
    }

    /**
     * @param c3 the c3 to set
     */
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
    @Override
    public void info(){
        System.out.println("Day la hinh tam giac: (do dai 3 canh) " + c1 + " " + c2 + " " + c3);
    }
}
