/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram123;

/**
 *
 * @author Xuan Dung
 */
public class Hexagon extends Shape{
     //kích thước cạnh lục giác đều
    private int width;

    public Hexagon(int width, String color) {
        this.width = width;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
    @Override
    public void show(boolean tf) {
        if(!tf) System.out.println("Removed Hexagon");
        else System.out.println("Hexagon in x = " + this.x + " and y = " + this.y);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Hexagon other = (Hexagon) obj;
        if (color == null) {
            if (other.color != null) {
                return false;
            }
        } else if (!color.equals(other.color)) {
            return false;
        }
        if (other.x != x) {
            return false;
        }
        if (other.y != y) {
            return false;
        }
        if (other.width != width) {
            return false;
        }
        return true;
    }
    
}
