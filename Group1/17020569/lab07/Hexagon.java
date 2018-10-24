package lab;
import java.awt.Color;
 public class Hexagon extends Shape{
            private int[] hx = new int[6];
	    private int[] hy = new int[6];
	public Hexagon(int a,int b,int c,int d,int e,int f, int g,int h,int i,int j,int k,int l,Color color, boolean filled, int x, int y){
	        super(x, y, filled, color);
	        this.hx[0]=a;
	        this.hx[1]=b;
	        this.hx[2]=c;
	        this.hx[3]=d;
	        this.hx[4]=e;
	        this.hx[5]=f;
	        this.hy[0]=g;
	        this.hy[1]=h;
	        this.hy[2]=i;
	        this.hy[3]=j;
	        this.hy[4]=k;
	        this.hy[5]=l;
	    }
	    public int[] getHX(){
	        return this.hx;
	    }
	    public int[] getHY(){
	        return this.hy;
	    }
}