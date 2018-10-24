package lap6;

public class toado {
    private double x, y;

    public toado() {
        x=0;
        y=0;
    }

    public toado(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
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
