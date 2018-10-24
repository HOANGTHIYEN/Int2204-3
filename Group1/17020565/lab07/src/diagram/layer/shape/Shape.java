package diagram.layer.shape;

import diagram.Position;

import java.awt.*;

public abstract class Shape {
    public Position[] pos;
    protected Color color;
    protected boolean canMove;

    public Shape(Position[] pos, Color color, boolean canMove) {
        this.color = color;
        this.canMove = canMove;
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int length, int huong){
        switch ( huong){
            case 1 :{
                for(Position position: pos){
                    position.posY = (position.posY - length);
                }
                break;
            }
            case 2 :{
                for(Position position: pos){
                    position.posY = (position.posY + length);
                }
                break;
            }
            case 3 :{
                for(Position position: pos){
                    position.posX = (position.posX - length);
                }
                break;
            }
            case 4 :{
                for(Position position: pos){
                    position.posX = (position.posX + length);
                }
                break;
            }
        }
    }
}
