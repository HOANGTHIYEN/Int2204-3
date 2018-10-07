public class Circle extends Shape {
    private double radius;
    final double Pi = 3.14;

    Circle(){
        radius = 1.0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Pi*this.radius*this.radius;
    }

    public double getPerimeter(){
        return 2*Pi*this.radius;
    }

}
