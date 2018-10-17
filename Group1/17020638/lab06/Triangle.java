/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author Dzung Xuan
 */
public class Triangle extends Shape{
    protected String kind;

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
}
