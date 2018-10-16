/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_05_2;

/**
 *
 * @author Admin
 */
public class Shape {
    protected String color;
    protected Boolean fill;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }
    Shape()
    {
        this.color="red";
        this.fill=true;
    }
    Shape(String color,Boolean fill)
    {
        this.color=color;
        this.fill=fill;
    }
}
