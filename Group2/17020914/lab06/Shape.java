/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author admin
 */
abstract class Shape {
    protected String color;
    protected boolean filled;
    protected double pos_x;
    protected double pos_y;
    
    public Shape(String n, boolean i, double x, double y){
        this.color = n;
        this.filled = i;
        this.pos_x = x;
        this.pos_y = y;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String n){
        this.color = n;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean i){
        this.filled = i;
    }
    public void moveTo(double x, double y){
        this.pos_x = x;
        this.pos_y = y;
    }
    @Override
    public String toString() {
        return color+" "+filled;
    }
    
}
