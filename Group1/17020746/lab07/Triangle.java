package lb7;

import java.awt.*;

public class Triangle extends Shape {
    private int[] xT = new int[3];
    private int[] yT = new int[3];

    public int[] getXT() {
        return xT;
    }

    public void setXT(int[] xT) {
        this.xT = xT;
    }

    public int[] getYT() {
        return yT;
    }

    public void setYT(int[] yT) {
        this.yT = yT;
    }

    //Constructor
    public Triangle() {

    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y, Color color, boolean filled) {
        super(x, y, color, filled);
        this.xT[0] =x1;
        this.yT[0] = y1;
        this.xT[1] = x2;
        this.yT[1] = y2;
        this.xT[2] = x3;
        this.yT[2] = y3;
    }
}
