package lap_06;

import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public abstract class Shape {
    public XYlocation xy;
    Color color= Color.BLACK;

    public Shape(XYlocation xy) {
        this.xy = xy;
    }
    
    public Shape(XYlocation xy, Color color) {
        this.xy = xy;
        this.color = color;
    }        
    public abstract void moving(XYlocation newLocation);
}
