package Week7;

import java.awt.Color;

public class Hexagon extends Shape {

    private int[] hx = new int[6];
    private int[] hy = new int[6];

    public Hexagon(int x0, int x1, int x2, int x3, int x4, int x5, int y0, int y1, int y2, int y3, int y4, int y5, Color color, boolean filled, int x, int y) {
        super(x, y, filled, color);

        this.hx[0] = x0;
        this.hx[1] = x1;
        this.hx[2] = x2;
        this.hx[3] = x3;
        this.hx[4] = x4;
        this.hx[5] = x5;
        this.hy[0] = y0;
        this.hy[1] = y1;
        this.hy[2] = y2;
        this.hy[3] = y3;
        this.hy[4] = y4;
        this.hy[5] = y5;
    }

    public int[] getHX() {
        return this.hx;
    }

    public int[] getHY() {
        return this.hy;
    }

}
