
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 123456789
 */
public class Shape {
    String color = "red";
    boolean filled = true;
    public Shape(){};
    public Shape(String color, boolean filled){
        
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
    
        return true;
    }
    public void setFilled(boolean filled){
        
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    

}
