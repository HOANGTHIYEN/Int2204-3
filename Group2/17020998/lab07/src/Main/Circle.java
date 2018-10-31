package Main;


import java.awt.*;

public class Circle extends Shape{
    private int r;

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    private Point p;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle(int x , int y, int r){
        try {
            p = new Point(x,y);
            this.r = r;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void moveTo(int new_x, int new_y){
        p.move(new_x,new_y);
    }



}
