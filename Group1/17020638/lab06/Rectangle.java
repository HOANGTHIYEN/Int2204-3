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
public class Rectangle extends Shape{
    protected int heigh;
    protected int weigh;


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

    public int getArea() {
        return this.weigh * this.heigh;
    }

    public int getPerimeter() {
        return 2 * (this.weigh + this.heigh);
    }
    
    @Override
    public void show(boolean tf) {
        if(!tf) System.out.println("Removed Rectangle");
        else System.out.println("Rectangle in x = " + this.x + " and y = " + this.y);
    }
}
