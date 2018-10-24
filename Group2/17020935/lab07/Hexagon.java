/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author DELL
 */
public class Hexagon extends Shape{
    private int[] hexagon_x = new int[6];
    private int[] hexagon_y = new int[6];
    
    public Hexagon(int x0,int x1,int x2,int x3,int x4,int x5, int y0,int y1,int y2,int y3,int y4,int y5,String n, boolean i, double x, double y){
        super(n,i,x,y);
        this.hexagon_x[0]=x0;
        this.hexagon_x[1]=x1;
        this.hexagon_x[2]=x2;
        this.hexagon_x[3]=x3;
        this.hexagon_x[4]=x4;
        this.hexagon_x[5]=x5;
        this.hexagon_y[0]=y0;
        this.hexagon_y[1]=y1;
        this.hexagon_y[2]=y2;
        this.hexagon_y[3]=y3;
        this.hexagon_y[4]=y4;
        this.hexagon_y[5]=y5;
    }
    public int[] getHexagon_x(){
        return this.hexagon_x;
    }
    public int[] getHexagon_y(){
        return this.hexagon_y;
    }
}