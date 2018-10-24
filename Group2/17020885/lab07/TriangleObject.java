
package lab07;

import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */

public class TriangleObject extends Shape {


    double [] points = new double [6];
    public TriangleObject(XYlocation dinh1, XYlocation dinh2, XYlocation dinh3, Color color) {
        super(dinh1, color);
        this.points[0]=dinh1.x;
        this.points[1]=dinh1.y;
        this.points[2]=dinh2.x;
        this.points[3]=dinh2.y;
        this.points[4]=dinh3.x;
        this.points[5]=dinh3.y;
    }

    public TriangleObject(XYlocation dinh1, XYlocation dinh2, XYlocation dinh3) {
        super(dinh1);
        this.points[0]=dinh1.x;
        this.points[1]=dinh1.y;
        this.points[2]=dinh2.x;
        this.points[3]=dinh2.y;
        this.points[4]=dinh3.x;
        this.points[5]=dinh3.y;
    }


    @Override
    public void moving(XYlocation newLocation) {
        this.points[0]=newLocation.x;
        this.points[1]=newLocation.y;
    }
}
