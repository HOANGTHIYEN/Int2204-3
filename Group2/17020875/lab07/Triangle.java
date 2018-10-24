package diagram.layer.shape;

import java.awt.*;
import java.util.Arrays;

public class Triangle extends Shape {
    protected double[] a;
    protected double[] b;
    protected double[] c;

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }

    public double[] getC() {
        return c;
    }

    public void setC(double[] c) {
        this.c = c;
    }

    @Override
    public void move(double dodai, int huong){
        switch ( huong){
            case 1 :{
                a[0] = a[0] - dodai;
                b[0] = b[0] - dodai;
                c[0] = c[0] - dodai;
            }
            case 2 :{
                a[0] = a[0] - dodai;
                b[0] = b[0] - dodai;
                c[0] = c[0] - dodai;
            }
            case 3 :{
                a[0] = a[0] - dodai;
                b[0] = b[0] - dodai;
                c[0] = c[0] - dodai;
            }
            case 4 :{
                a[0] = a[0] - dodai;
                b[0] = b[0] - dodai;
                c[0] = c[0] - dodai;
            }
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + Arrays.toString(a) +
                ", b=" + Arrays.toString(b) +
                ", c=" + Arrays.toString(c) +
                ", posX=" + posX +
                ", posY=" + posY +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
