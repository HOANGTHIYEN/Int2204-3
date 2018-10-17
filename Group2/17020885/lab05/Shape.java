/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Dell
 */
public class Shape {
    String color;
    boolean filled;

    public Shape() {
        this.color="red";
        this.filled=true;
        
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
    
    /*
    public Shape(String color, boolean filled) {
        this.color = "red";
        this.filled = true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
