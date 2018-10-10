public class Circle extends Shape {
    private double radius;
    public Circle(){
        new Shape();
        this.radius=1.0;
    }
    public Circle(double radius){
        new Shape();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        super.setColor(color);
        super.setFilled(filled);
        new Shape(getColor(),getFilled());
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea() {
        return 3.14*getRadius()*getRadius();
    }
    public double getPerimeter(){
        return 2*3.14*getRadius();
    }
    public String toString()
    {
        return radius + "\t" + super.toString();
    }
}
