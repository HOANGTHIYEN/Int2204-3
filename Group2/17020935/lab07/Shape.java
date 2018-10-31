/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;


import java.awt.Color;

/**
 *
 * @author admin
 */
abstract class Shape {
    protected String color;
    protected boolean filled;
    protected double x;
    protected double y;
    
    public Shape(String n, boolean i, double x, double y){
        this.color = n;
        this.filled = i;
        this.x = x;
        this.y = y;
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
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return color+" "+filled;
    }
    
}