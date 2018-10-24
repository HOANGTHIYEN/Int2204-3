/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author DELL
 */
public class Triangle extends Shape {
    private int t1, t2, t3;

    public int getT1() {
        return t1;
    }

    public int getT2() {
        return t2;
    }

    public int getT3() {
        return t3;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public void setT3(int t3) {
        this.t3 = t3;
    }
    
    public Triangle(){
        super();
        t1 = t2 = t3 =0;
    }
    public Triangle(int t1, int t2, int t3){
        super();
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
    public Triangle(int width, int length, int x, int y, String color, int Lx, int Ly, int t1, int t2, int t3){
        super(x, y, width, length, color);
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
    public void drawTriangle(){
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
        this.drawShape();
    }
}