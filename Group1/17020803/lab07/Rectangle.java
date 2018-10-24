public class Rectangle extends Shape {
    private int width;
    private int length;
    public Rectangle() {

    }
    public Rectangle(int x, int y, int width, int length) {
        super.x = x;
        super.y = y;
        this.width = width;
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}