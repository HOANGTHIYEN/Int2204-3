package Lab07;

public class Hexagon extends Shape{
    double wide;

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public Hexagon() {
    }

    public Hexagon(String color, boolean filled, Location mid, double wide) {
        super(color, filled, mid);
        this.wide = wide;
    }
}
