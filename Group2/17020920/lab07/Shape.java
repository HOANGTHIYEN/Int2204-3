package Lab07;

import java.awt.Color;

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
    public void setX(double x){
        this.pos_x = x;
    }
    public void setY(double y){
        this.pos_y = y;
    }
    public double getX(){
        return this.pos_x;
    }
    public double getY(){
        return this.pos_y;
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
