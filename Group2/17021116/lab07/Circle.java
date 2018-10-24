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
public class Circle extends Shape{
    Position center;
    double radius;

    public Circle(Position center, double radius, Color color) {
        super(center, color);
        this.center = center;
        this.radius = radius;
    }

    public Circle(Position center, double radius) {
        super(center);
        this.center = center;
        this.radius = radius;
    }    
    
        @Override
    public void moving(Position newLocation) {
        this.center = newLocation;
        
    }

    public Position getCenter() {
        return center;
    }

    public void setCenter(Position center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
