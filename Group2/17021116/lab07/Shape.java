
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
public abstract class Shape{
    public Position xy;
    Color color= Color.BLACK;

    public Shape(Position xy) {
        this.xy = xy;
    }
    
    public Shape(Position xy, Color color) {
        this.xy = xy;
        this.color = color;
    }        
    public abstract void moving(Position newPosition);
}
