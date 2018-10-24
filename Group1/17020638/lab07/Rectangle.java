/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram123;

/**
 *
 * @author Xuan dung
 */
public class Rectangle extends Shape{
    

private int heigh;
    private int weigh;

    public Rectangle(int heigh, int weigh, String color) {
        this.color = color;
        this.heigh = heigh;
        this.weigh = weigh;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public void show(boolean tf) {
        if (!tf) {
            System.out.println("Removed Rectangle");
        } else {
            System.out.println("Rectangle in x = " + this.x + " and y = " + this.y);
        }
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
        Rectangle other = (Rectangle) obj;
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
        if (other.heigh != heigh) {
            return false;
        }
        if (other.weigh != weigh) {
            return false;
        }
        return true;
    }
}
