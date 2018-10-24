package lap6;

public class toado {
    private int x, y;

    public toado() {
        x=150;
        y=150;
    }

    public toado(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "toado{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
