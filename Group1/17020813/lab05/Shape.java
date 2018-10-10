/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

public class Shape {
    protected String color;
    protected boolean flied;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFlied() {
        return flied;
    }

    public void setFlied(boolean flied) {
        this.flied = flied;
    }

    public Shape(String color, boolean flied) {
        this.color = color;
        this.flied = flied;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", flied=" + flied + '}';
    }
}
