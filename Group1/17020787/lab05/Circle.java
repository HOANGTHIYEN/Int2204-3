package lap5;
class Circle extends Shape {
    private  double radius=1.0;
    private final double PI=3.14;

    public Circle(){
        super("red",true);
    }
    public Circle(double radius) {
        super("red",true);
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
    public  double getPerimeter(){
        return radius*PI*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
