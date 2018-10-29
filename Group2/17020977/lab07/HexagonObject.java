/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_06;

import static java.lang.Math.sqrt;
import javafx.scene.paint.Color;


public class HexagonObject extends Shape{

    XYlocation center;
    double side;
    double [] top = new double [12]; 
    public HexagonObject(XYlocation xy,double side, Color color) {
        super(xy, color);
        this.side=side;
        this.center = xy;
        double H = (sqrt(3)/2)*side;
        this.top[0]=center.x;
        this.top[1]=center.y-side;
        this.top[2]=center.x + H;
        this.top[3]=center.y- side/2;
        this.top[4]=center.x+H;
        this.top[5]=center.y+side/2;
        this.top[6]=center.x;
        this.top[7]=center.y+side;
        this.top[8]=center.x-H;
        this.top[9]=center.y+side/2;
        this.top[10]=center.x-H;
        this.top[11]=center.y-side/2;
    }

    @Override
    public void moving(XYlocation newLocation) {
        this.center = newLocation;
    }
    
}
