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

public class Circle extends Shape{
     toado tam;
    double radius;
     
     public Circle (toado tam, double radius, Color color) {
        super(tam, color);
        this.tam = tam;
        this.radius = radius;
    }
     public Circle (toado tam, double radius) {
        super(tam);
        this.tam = tam;
        this.radius = radius;
    }
    
    
        @Override
    public void moved(toado n ) {
        this.tam = n ;
        
    }
     public toado getTam() {
        return tam;
    }
     public void setTam(toado t) {
        this.tam = t;
    }
     public double getRadius() {
        return radius;
    }
     public void setRadius(double radius) {
        this.radius = radius;
    }
}

