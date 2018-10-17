package lab06;
public class Triagle extends Shape {
    XY Dinh1,Dinh2,Dinh3;

    public Triagle(XY Dinh1, XY Dinh2, XY Dinh3, String color, boolean filled, XY xy) {
        super(color, filled, xy);
        this.Dinh1 = Dinh1;
        this.Dinh2 = Dinh2;
        this.Dinh3 = Dinh3;
    }

    public Triagle(XY Dinh1, XY Dinh2, XY Dinh3) {
        this.Dinh1 = Dinh1;
        this.Dinh2 = Dinh2;
        this.Dinh3 = Dinh3;
    }

    public XY getDinh1() {
        return Dinh1;
    }

    public void setDinh1(XY Dinh1) {
        this.Dinh1 = Dinh1;
    }

    public XY getDinh2() {
        return Dinh2;
    }

    public void setDinh2(XY Dinh2) {
        this.Dinh2 = Dinh2;
    }

    public XY getDinh3() {
        return Dinh3;
    }

    public void setDinh3(XY Dinh3) {
        this.Dinh3 = Dinh3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public XY getXy() {
        return xy;
    }

    public void setXy(XY xy) {
        this.xy = xy;
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

    @Override
    public String toString() {
        return "Triagle{" + "x=" + x + ", y=" + y + ", egde1=" + egde1 + ", egde2=" + egde2 + ", egde3=" + egde3 + '}';
    }


}
