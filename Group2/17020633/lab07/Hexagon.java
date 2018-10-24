/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import static java.lang.Math.sqrt;
import javafx.scene.paint.Color;
/**
 *
 * @author Dell
 */
public class Hexagon extends Shape{
     toado tam;
    double side;
    double [] point = new double [12]; 
    public Hexagon (toado tam,double side, Color color) {
        super(xy, color);
        this.side=side;
        this.tam = xy;
        double H = (sqrt(3)/2)*side;
        
        this.point[0]=tam.x;
        this.point[1]=tam.y-side;
        this.point[2]=tam.x + H;
        this.point[3]=tam.y- side/2;
        this.point[4]=tam.x+H;
        this.point[5]=tam.y+side/2;
        this.point[6]=tam.x;
        this.point[7]=tam.y+side;
        this.point[8]=tam.x-H;
        this.point[9]=tam.y+side/2;
        this.point[10]=tam.x-H;
        this.point[11]=tam.y-side/2;
    }
     @Override
    public void moved(toado newLocation) 
    {
        this.tam = newLocation;
    }
}
