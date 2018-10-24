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
public class Triangle extends Shape{
    private String kind;

    public Triangle(String kind, String color) {
        this.color = color;
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public void show(boolean tf) {
        if(!tf) System.out.println("Removed Triangle");
        else System.out.println("Triangle in x = " + this.x + " and y = " + this.y);
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
        Triangle other = (Triangle) obj;
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
        if (!other.kind.equals(kind)) {
            return false;
        }
        return true;
    }
}
