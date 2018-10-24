package Main;

import java.awt.*;

public class Rectangle extends Shape {

    protected Point p1;
    protected Point p2;
    protected Point p3;
    protected Point p4;

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        try {
            p1 = new Point(x1,y1);
            p2 = new Point(x2,y2);
            p3 = new Point(x3,y3);
            p4 = new Point(x4,y4);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public void moveTo(int new_x, int new_y){
        p1.move(new_x,new_y);
        p2.move(new_x,new_y);
        p3.move(new_x,new_y);
        p4.move(new_x,new_y);
    }

}
