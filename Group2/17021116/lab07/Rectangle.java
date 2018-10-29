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
public class Rectangle extends Shape{
    Position center;
    double width;
    double length;

    public Rectangle(Position center, double width, double length, Color color) {
        super(center, color);
        this.center = center;
        this.width = width;
        this.length = length;
    }

    public Rectangle(Position center, double width, double length) {
        super(center);
        this.center = center;
        this.width = width;
        this.length = length;
    }

    
        @Override
    public void moving(Position newLocation) {
        this.center = newLocation;
    }
    
}
