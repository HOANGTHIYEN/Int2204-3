package lb6;

public abstract class Shape {
    protected String name;
    protected int x, y, moveX, moveY;
    protected String color;
    protected boolean filled, pos;

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

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public void setName(String color){
        this.name = color;
    }

    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public boolean isPos() {
        return pos;
    }
    public void setPos(boolean pos) {
        this.pos = pos;
    }

    //Constructor
    public Shape(int x, int y, int moveX, int moveY, String color, boolean filled, boolean pos) {
        this.x = x;
        this.y = y;
        this.moveX = moveX;
        this.moveY = moveY;
        this.color = color;
        this.filled = filled;
        this.pos = pos;
    }

    public Shape(){
        //Emty
    }

    public void shapeMove(int moveX, int moveY){
        this.x = this.x + moveX;
        this.y = this.y + moveY;
    }


    public String toString(){
        return name + ", color: " + color + ", " + "filled: " + filled + ", pos: " + pos + ", "
                + "Tọa độ cũ: x = " + x + "; y = " + y + ", "
                + "Tọa độ mới: x = " + (x + moveX) + "; y = " + (y+moveY);
    }
}
