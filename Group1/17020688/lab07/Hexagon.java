/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My PC
 */
public class Hexagon extends  Shape{
    int[] x=new int[6];
    int[] y=new int[6];

   public Hexagon(int x1,int x2,int x3,int x4,int x5,int x6,int y1,int y2,int y3,int y4,int y5,int y6)
   {    super();
        this.x[1]=x1;
        this.x[2]=x2;
        this.x[3]=x3;
        this.x[4]=x4;
        this.x[5]=x5;
        this.x[6]=x6;
        this.y[1]=y1;
        this.y[2]=y2;
        this.y[3]=y3;
        this.y[4]=y4;
        this.y[5]=y5;
        this.y[6]=y6;
    }
    public int[] getx()
    {
        return this.x;
        
    }
    public int[] gety()
    {
        return this.y;
    }
    
}
