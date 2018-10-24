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
public class Square extends Shape{
    
private int weigh;

    public Square(int weigh, String color) {
        this.color = color;
        this.weigh = weigh;
    }

    
    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public void show(boolean tf) {
        if(!tf) System.out.println("Removed Square");
        else System.out.println("Square in x = " + this.x + " and y = " + this.y);
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
        Square other = (Square) obj;
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
        if (other.weigh != weigh) {
            return false;
        }
        return true;
    }
}
