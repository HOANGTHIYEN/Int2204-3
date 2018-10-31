package Main;

public class Point {
    private int x;
    private int y;

    public Point(int X, int Y){
        x = X;
        y = Y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }
}
