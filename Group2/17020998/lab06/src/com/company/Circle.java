package com.company;

public class Circle extends Shape{
    private int r;

    public Circle(int x , int y, int r){
        super(x,y);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle at (" + this.x + "," + this.y + ")");
    }

    public void erase(){
        System.out.println("Erase Circle at (" + this.x + "," + this.y + ")");
    }

    public void moveTo(int new_x, int new_y){
        erase();
        this.x = new_x;
        this.y = new_y;
        draw();
    }
}
