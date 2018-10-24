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
public class Square extends Shape{
    protected int weigh;

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

    public int getArea() {
        return this.weigh * this.weigh;
    }

    public int getPerimeter() {
        return 2 * (this.weigh + this.weigh);
    }
    
    @Override
    public void show(boolean tf) {
        if(!tf) System.out.println("Removed Square");
        else System.out.println("Square in x = " + this.x + " and y = " + this.y);
    }
}
