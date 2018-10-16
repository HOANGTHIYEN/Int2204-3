package com.company;

public class square extends rectangle {
    double side;
    public square(){}
    public square(double side){
        super(side,side);
        this.side=side;
    }

    public square( double side,String color, boolean filled) {
        super(side,side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.width = side;
        super.length=side;
    }
    public void setWidth(double side){
        super.width=side;
        super.length=side;
    }
    public void setLength(double side){
        super.length=side;
        super.width=side;
    }

    @Override
    public String toString() {
        return "square{" +
                "side=" + side +
                '}';
    }
}
