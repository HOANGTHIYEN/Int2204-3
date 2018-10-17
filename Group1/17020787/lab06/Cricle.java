package lap6;

public class Cricle extends Shape {
    protected double radius;
    final double pi = 3.14;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius, String color, boolean filled, toado center) {
        super(color, filled, center);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", pi=" + pi +",color:"+this.Color+" "+center.toString();
    }
}
