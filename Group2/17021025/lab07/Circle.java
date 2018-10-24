public class Circle extends Shape {
    private int radian;
    public Circle() {}
    public Circle(int x, int y, int radian) {
        super.x = x;
        super.y = y;
        this.radian = radian;
    }
    public int getRadian() {
        return radian;
    }
    public void setRadian(int radian) {
        this.radian = radian;
    }
    @Override
    public void move(int x, int y) {
        super.x = x;
        super.y = y;
    }
}