/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import javafx.scene.paint.Color;

/**
 *
 * @author Hoangson
 */
//lop circle ke thua lop shape
public class CircleObject extends Shape{
    //toa do tam va ban kinh
    XYlocation center;
    double radius;

    public CircleObject(XYlocation center, double radius, Color color) {
        super(center, color);
        this.center = center;
        this.radius = radius;
    }

    public CircleObject(XYlocation center, double radius) {
        super(center);
        this.center = center;
        this.radius = radius;
    }
    
    
        @Override
    public void moving(XYlocation newLocation) {
        this.center = newLocation;
        
    }

}
