package com.company;

public abstract class Shape extends Layer{
    protected boolean filled;
    protected int x,y;
    private int index;

    public Shape(){};
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    abstract public void erase();
    abstract public void draw();
    abstract public void moveTo(int new_x, int new_y);

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
