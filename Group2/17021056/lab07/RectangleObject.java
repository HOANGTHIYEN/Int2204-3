/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import javafx.scene.paint.Color;

/**
 *
 * @author admin
 */
//lop rectangle ke thua lop shape
public class RectangleObject extends Shape{
    //toa do tam va do dai 2 canh
    XYlocation center;
    double width;
    double length;

    public RectangleObject(XYlocation center, double width, double length, Color color) {
        super(center, color);
        this.center = center;
        this.width = width;
        this.length = length;
    }

    public RectangleObject(XYlocation center, double width, double length) {
        super(center);
        this.center = center;
        this.width = width;
        this.length = length;
    }

    
        @Override
    public void moving(XYlocation newLocation) {
        this.center = newLocation;
    }

}
