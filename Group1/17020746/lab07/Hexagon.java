package lb7;

import java.awt.*;

public class Hexagon extends Shape{
    private int[] xH = new int[6];
    private int[] yH = new int[6];

    public int[] getXH() {
        return xH;
    }

    public void setXH(int[] xH) {
        this.xH = xH;
    }

    public int[] getYH() {
        return yH;
    }

    public void setYH(int[] yH) {
        this.yH = yH;
    }

    public Hexagon(int x0, int x1, int x2, int x3, int x4, int x5, int y0, int y1, int y2, int y3, int y4, int y5, int x, int y, Color color, boolean filled){
        super(x, y, color, filled);

        this.xH[0]=x0;
        this.xH[1]=x1;
        this.xH[2]=x2;
        this.xH[3]=x3;
        this.xH[4]=x4;
        this.xH[5]=x5;
        this.yH[0]=y0;
        this.yH[1]=y1;
        this.yH[2]=y2;
        this.yH[3]=y3;
        this.yH[4]=y4;
        this.yH[5]=y5;
    }
}
