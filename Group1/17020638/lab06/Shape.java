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
public abstract class Shape {

    protected int x;
    protected int y;
    protected String color;
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void move(int x, int y){
        this.show(false);
        this.x = x;
        this.y = y;
        this.show(true);
    }

    public abstract void show(boolean tf);
}


