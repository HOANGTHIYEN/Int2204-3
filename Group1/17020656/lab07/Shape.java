/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Shape {
    protected Color color=Color.RED;
    protected boolean filled=true;
    protected int moveX=1;
    protected int moveY=1;
    protected int X=0;
    protected int Y=0;
    

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    public int getMoveX() {
        return moveX;
    }
    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }

    public int getMoveY() {
        return moveY;
    }

    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }
    
    Shape()
    {
        
    }

    public Shape(Color color, boolean filled,int moveX,int moveY,int X,int Y) {
        this.color=color;
        this.filled=filled;
        this.moveX=moveX;
        this.moveY=moveY;
        this.X=X;
        this.Y=Y;
    }

    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
  
}
