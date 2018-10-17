package Shape_type;

import ShapePackage.Shape;

public class Triangle extends Shape {
    private int c1, c2, c3;

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }

    public int getC3() {
        return c3;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }
    
    public Triangle(){
        super();
        c1 = c2 = c3 =0;
    }
    public Triangle(int c1, int c2, int c3){
        super();
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    public Triangle(int width, int length, int x, int y, String color, int Lx, int Ly, int c1, int c2, int c3){
        super(x, y, width, length, color);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    public void drawTriangle(){
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        System.out.println("C3: " + c3);
        this.drawShape();
    }
}