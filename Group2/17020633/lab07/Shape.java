/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Dell
 */
import javafx.scene.paint.Color;


public abstract class Shape  {
   public toado xy;
    Color color= Color.BLACK;
     public Shape(toado xy) {
        this.xy = xy;
    }
    
    public Shape(toado xy, Color color) {
        this.xy = xy;
        this.color = color;
    }        
    public abstract void moved(toado newLocation);
 
}

