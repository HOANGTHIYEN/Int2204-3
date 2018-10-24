package diagram.layer.shape;

import java.awt.*;

public abstract class Shape {
    protected double posX;
    protected double posY;
    protected Color color;
    protected boolean canMove;

    public Shape() {
    }

    public Shape(double posX, double posY, Color color, boolean canMove) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
        this.canMove = canMove;
    }

    public  double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(double dodai, int huong){
        switch ( huong){
            case 1 :posY = posY - dodai;
            case 2 :posY = posY + dodai;
            case 3 :posY = posY - dodai;
            case 4 :posY = posY + dodai;
        }
    }
}
