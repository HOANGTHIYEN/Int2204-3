package lab06;
public class Triagle extends Shape {
    double x,y;
    double egde1,egde2,egde3;

    public Triagle(double x, double y, double egde1, double egde2, double egde3) {
        this.x = x;
        this.y = y;
        this.egde1 = egde1;
        this.egde2 = egde2;
        this.egde3 = egde3;
    }

    public Triagle(double x, double y, double egde1, double egde2, double egde3, String color, boolean filled) {
        super(color, filled);
        this.x = x;
        this.y = y;
        this.egde1 = egde1;
        this.egde2 = egde2;
        this.egde3 = egde3;
    }
    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getEgde1() {
        return egde1;
    }

    public void setEgde1(double egde1) {
        this.egde1 = egde1;
    }

    public double getEgde2() {
        return egde2;
    }

    public void setEgde2(double egde2) {
        this.egde2 = egde2;
    }

    public double getEgde3() {
        return egde3;
    }

    public void setEgde3(double egde3) {
        this.egde3 = egde3;
    }

    @Override
    public String toString() {
        return "Triagle{" + "x=" + x + ", y=" + y + ", egde1=" + egde1 + ", egde2=" + egde2 + ", egde3=" + egde3 + '}';
    }
    
}
