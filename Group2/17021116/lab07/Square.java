/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import javafx.scene.paint.Color;

/**
 *
 * @author 123456789
 */
public class Square extends Rectangle{
    public Square(Position center, double side, Color color) {
        super(center, side, side, color);
    }

    public Square(Position center, double side) {
        super(center, side, side);
    }
}

