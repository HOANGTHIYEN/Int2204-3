package lab7;

public class Hexagon extends Shape {

    protected int x, y, side;
    protected int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6;

    public Hexagon(int x, int y, int side) {

        this.x = x;
        this.y = y;

        x1 = (int) (x + side * Math.cos(0 * 2 * Math.PI / 6));
        x2 = (int) (x + side * Math.cos(1 * 2 * Math.PI / 6));
        x3 = (int) (x + side * Math.cos(2 * 2 * Math.PI / 6));
        x4 = (int) (x + side * Math.cos(3 * 2 * Math.PI / 6));
        x5 = (int) (x + side * Math.cos(4 * 2 * Math.PI / 6));
        x6 = (int) (x + side * Math.cos(5 * 2 * Math.PI / 6));

        y1 = (int) (y + side * Math.sin(00 * 2 * Math.PI / 6));
        y2 = (int) (y + side * Math.sin(1 * 2 * Math.PI / 6));
        y3 = (int) (y + side * Math.sin(2 * 2 * Math.PI / 6));
        y4 = (int) (y + side * Math.sin(3 * 2 * Math.PI / 6));
        y5 = (int) (y + side * Math.sin(4 * 2 * Math.PI / 6));
        y6 = (int) (y + side * Math.sin(5 * 2 * Math.PI / 6));

    }

    public int getSide() {
        return side;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getX4() {
        return x4;
    }

    public int getY4() {
        return y4;
    }

    public int getX5() {
        return x5;
    }

    public int getY5() {
        return y5;
    }

    public int getX6() {
        return x6;
    }

    public int getY6() {
        return y6;
    }

}
