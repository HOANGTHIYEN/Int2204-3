
package lab7;

import java.awt.Graphics;

 
public class Shape {

    protected String color = "red";        
    protected boolean filled = true;
    protected toaDo Tam;
    protected boolean visible;

    public void setVisible(boolean a) {
        this.visible = a;
    }

    public Shape() {

    }

    public toaDo getTam() {
        return Tam;
    }

    public void setTam(toaDo tam) {
        this.Tam.setX(tam.getX());
        this.Tam.setY(tam.getY());
    }

    /*constructor*/
    public Shape(String color, boolean filled, toaDo Tam) {
        this.color = color;
        this.filled = filled;
        this.Tam = Tam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }               //getFiller

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void Move(double x, double y) {
        Tam.setX(x);
        Tam.setY(y);
    }

    public void getinfo() {
        System.out.println("");
    }
    public void Ve(Graphics g) {
        
    }
   
}