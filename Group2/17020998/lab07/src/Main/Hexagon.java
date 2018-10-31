package Main;


public class Hexagon extends Shape {

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private Point p5;
    private Point p6;



    public Hexagon(int x1, int y1, int x2, int y2, int x3, int y3,int x4, int y4, int x5, int y5, int x6, int y6){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        p3 = new Point(x3,y3);
        p4 = new Point(x4,y4);
        p5 = new Point(x5,y5);
        p6 = new Point(x6,y6);
    }

    public void moveTo(int new_x, int new_y){
        p1.move(new_x,new_y);
        p2.move(new_x,new_y);
        p3.move(new_x,new_y);
        p4.move(new_x,new_y);
        p5.move(new_x,new_y);
        p6.move(new_x,new_y);
    }
}
