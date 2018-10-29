public class Triangle extends Shape{
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    public Triangle() {

    }
    public Triangle(int x, int y,int x2, int y2, int x3, int y3) {
        super.x = x;
        super.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public int getX3() {
        return x3;
    }
    public void setX3(int x3) {
        this.x3 = x3;
    }
    public int getY3() {
        return y3;
    }
    public void setY3(int y3) {
        this.y3 = y3;
    }
    @Override
    public void move(int x, int y) {
        int a = this.x - x;
        int b = this.y - y;
        this.x = x;
        this.y = y;
        x2 = x2 - a;
        y2 = y2 - b;
        x3 = x3 - a;
        y3 = y3 - b;
    }
}