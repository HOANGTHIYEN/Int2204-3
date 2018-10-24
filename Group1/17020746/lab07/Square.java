package lb7;

import java.awt.*;

public class Square extends Rectangle{
    private double side;

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setSide(double Side){
        super.setWidth(side);
        super.setLength(side);
        this.side = Side;
    }

    public double getSide(){
        return side;
    }

    public Square(){
        //Emty
    }

    public Square(double Side){
        this.side = Side;
        this.width = Side;
        this.length = Side;
    }

    public Square(double Side, int x, int y, Color color, boolean filled){
        super(Side, Side, x, y, color, filled);
        this.side = Side;
    }

    public String toString(){
        return super.toString() + side;
    }
}
