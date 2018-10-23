/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import static java.lang.Math.sqrt;
import javafx.scene.paint.Color;

/**
 *
 * @author Hoangson
 */
public class HexagonObject extends Shape{

    XYlocation center;
    double side;
    double [] points = new double [12]; 
    public HexagonObject(XYlocation xy,double side, Color color) {
        super(xy, color);
        this.side=side;
        this.center = xy;
        double H = (sqrt(3)/2)*side;
        this.points[0]=center.x;
        this.points[1]=center.y-side;
        this.points[2]=center.x + H;
        this.points[3]=center.y- side/2;
        this.points[4]=center.x+H;
        this.points[5]=center.y+side/2;
        this.points[6]=center.x;
        this.points[7]=center.y+side;
        this.points[8]=center.x-H;
        this.points[9]=center.y+side/2;
        this.points[10]=center.x-H;
        this.points[11]=center.y-side/2;
    }

    @Override
    public void moving(XYlocation newLocation) {
        this.center = newLocation;
    }
    
}
