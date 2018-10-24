public class Circle extends Shape{
    protected double radius;
    final double PI = 3.14;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, Point point){
        super(color, filled, point);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * PI;
    }

    public double getPerimeter(){
        return radius * 2 * PI;
    }

    @Override
    public String toString(){
        String str = "Circle \n" + super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        return str;
    }

}
