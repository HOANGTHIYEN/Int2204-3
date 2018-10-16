package tuan5_2;

public class Circle extends Shape{
    private double radius;
    final double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2*pi*radius;
    }

    public double getArea() {
        return pi*radius*radius;
    }

	@Override
	public String toString() {
		return "Circle [getRadius()=" + getRadius() + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea()
				+ "]";
	}

	

	

	

	
    
  
    
}
