/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author nguyen ngoc gioi
 */
abstract class Shape {

    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    protected boolean filled;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected boolean diChuyen;

    public boolean getDiChuyen() {
        return diChuyen;
    }

    public void setDiChuyen(boolean diChuyen) {
        this.diChuyen = diChuyen;
    }

    public Shape() {

        diChuyen = true;
        color = "red";
        filled = true;

    }

    public Shape(boolean dc, String ms, boolean f) {
       
        diChuyen = dc;
        color = ms;
        filled = f;
    }

    public String toString() {
        return "Shape:\n  "
                + "\n   Di Chuyen: " + diChuyen + "\n   Color: " + color + "\n   Filled: " + filled + "\n";

    }
}
