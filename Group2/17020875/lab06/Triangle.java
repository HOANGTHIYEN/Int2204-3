import static java.lang.StrictMath.sqrt;

public class Triangle extends Shape{
    protected double canh1;
    protected double canh2;
    protected double canh3;

    protected double x1;
    protected double x2;
    protected double x3;
    protected double y1;
    protected double y2;
    protected double y3;

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public double getX1() {
        return x1;
    }

    public double getX3() {
        return x3;
    }

    public double getX2() {
        return x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public Triangle()
    {
        this.canh1 = 1.0;
        this.canh2 = 1.0;
        this.canh3 = 1.0;
    }
    public Triangle(double canh1, double canh2, double canh3, double x1, double x2, double x3, double y1, double y2, double y3)
    {

        this.canh1 = 1;
        this.canh2 = 1;
        this.canh3 = 2 * sqrt(2);
        this.x1 = 0;
        this.x2 = 1;
        this.x3 = 0;
        this.y1 = 0;
        this.y2 = 0;
        this.y3 = 1;
    }
    public Triangle(double canh1, double canh2, double canh3, String color, boolean filled, double x1, double x2, double x3, double y1, double y2, double y3)
    {
        super(color, filled);
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
        this.x1 =x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }

    public double getCanh1() {
        return canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public double getCanh3() {
        return canh3;
    }

}
