/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
import javafx.scene.paint.Color;

/**
 *
 * @author Dell
 */
public class Square  extends Rectangle {
     public Square (toado tam, double side, Color color) {
        super(tam, side, side, color);
    }
     public Square(toado tam, double side) {
        super(tam, side, side);
    }
    
    
}