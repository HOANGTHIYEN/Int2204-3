
package Javaapllication4;
import java.awt.Color;
public class Hexagon extends Shape{
	
	    private int[] x = new int[6];
	    private int[] y = new int[6];
    public Hexagon(int x0,int x1,int x2,int x3,int x4,int x5, int y0,int y1,int y2,int y3,int y4,int y5 ,boolean filled, boolean visible, Color color, int x, int y) {
        super(filled, visible, color, x, y);
         this.x[0]=x0;
	        this.x[1]=x1;
	        this.x[2]=x2;
	        this.x[3]=x3;
	        this.x[4]=x4;
	        this.x[5]=x5;
	        this.y[0]=y0;
	        this.y[1]=y1;
	        this.y[2]=y2;
	        this.y[3]=y3;
	        this.y[4]=y4;
	        this.y[5]=y5;
    }

    public int[] getHexagonX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getHexagonY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }
    
}
