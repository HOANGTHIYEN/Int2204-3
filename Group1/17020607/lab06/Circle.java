
package Week6;

public class Circle extends Shape {

    protected double r;
    final double pi = 3.1416;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public Circle(double r, double x, double y, String color, boolean filled){
        super(x, y, color, filled);
        this.r = r;
        super.setColor(color);
    }
    public String toString(){
        return "x: " + x + " y: " + y + " color: " + color + " filled: " + filled + " r: " + r;
    }
}