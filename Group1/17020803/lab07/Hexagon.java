public class Hexagon extends Shape {
    private int[] x1 = new int [5];
    private int[] y1 = new int [5];
    public Hexagon (int x, int y, int[] x1, int[] y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    public int[] getX1() {
        return x1;
    }
    public void setX1(int[] x1) {
        this.x1 = x1;
    }
    public int[] getY1() {
        return y1;
    }
    public void setY1(int[] y1) {
        this.y1 = y1;
    }
    @Override
    public void move(int x, int y) {
        int a = this.x - x;
        int b = this.y - y;
        this.x = x;
        this.y = y;
        for (int i=0; i<5; i++) {
            x1[i] = x1[i] - a;
            y1[i] = y1[i] - b;
        }
    }
}