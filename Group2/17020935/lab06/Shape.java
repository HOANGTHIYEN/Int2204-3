/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author DELL
 */
public class Shape extends Layer {
    private String color;
    public String getColor() {
        return color;
    }

    public Shape(){
        super();
        color = "red";
    }
    public Shape(String color){
        super();
        this.color = color;
    }
    public Shape(int x, int y, int width, int length, String color){
        super(width, length, x, y);
        this.color = color;
    }

    public void drawShape(){
        System.out.println("Color: " + color);
        this.drawLayer();
    }
     public void setColor(String color) {
        this.color = color;
    }
}