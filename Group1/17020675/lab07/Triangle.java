
import java.awt.Color;


public class Triangle extends Shape {
    protected double x1,y1,x2,y2,x3,y3;

    Triangle()
    {
        
    }
     
    Triangle(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
}
