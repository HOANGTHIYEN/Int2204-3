package Main;

import java.awt.*;

public class Triangle extends Shape {

    private Point p1;
    private Point p2;
    private Point p3;



    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        p3 = new Point(x3,y3);
    }

    public void moveTo(int new_x, int new_y){
        p1.move(new_x,new_y);
        p2.move(new_x,new_y);
        p3.move(new_x,new_y);
    }

}
