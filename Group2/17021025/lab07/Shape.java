public abstract class Shape{
    protected String color;
    protected int x;
    protected int y;
    public Shape() {

    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setColor(String color) {
        this.color = color;
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
    public String getColor() {
        return color;
    }
    public abstract void move(int x, int y);
}