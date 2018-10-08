/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap05.shape;

/**
 *
 * @author Nguyen Thai
 */
public class Shape {
    String color = "red";
    boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Shape(){
        
    }
    public Shape( String color , boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }

    public boolean isFilled() {
        return filled;
    }

}
