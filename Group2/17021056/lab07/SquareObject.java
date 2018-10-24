package lab07;

import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
//lop square ke thua lop rectangle
public class SquareObject extends RectangleObject{

    public SquareObject(XYlocation tam, double canh, Color color) {
        super(tam, canh , canh, color);
    }

    public SquareObject(XYlocation tam, double canh) {
        super(tam, canh, canh);
    }
    
    
}
