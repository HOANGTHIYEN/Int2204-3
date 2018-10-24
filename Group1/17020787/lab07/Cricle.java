package lap6;

import java.awt.*;

public class Cricle extends Shape {
    protected int radius;
    final double pi = 3.14;

    public Cricle() {
        int a[]={150};
        int b[]={150};
        radius=50;
        color= Color.YELLOW;
        this.x=a;
        this.y=b;
        }

    public Cricle(int radius) {
        int a[]={150};
        int b[]={150};
        x=a;
        y=b;
        this.radius = radius;
    }

    public Cricle(int radius, Color color, boolean filled,int[] x1,int [] y1) {
        this.color=color;
        this.filled=filled;
        this.x=x1;
        this.y=y1;
        this.radius = radius;
        if(x1.length!=1||y1.length!=1) filled=false;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }

}
