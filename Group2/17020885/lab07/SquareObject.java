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

public class SquareObject extends RectangleObject{

    public SquareObject(XYlocation center, double side, Color color) {
        super(center, side, side, color);
    }

    public SquareObject(XYlocation center, double side) {
        super(center, side, side);
    }
    
    
}
