package shape;


public class Circle extends Shape {
    Double radius ;
    public final float PI = (float) 3.14;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean fill) {
        super(color, fill);
        this.radius = radius;
    }

    
    
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
   
    public Double getArea() {
        return this.radius*this.radius*PI;
    }
    
    public Double getPerimeter(){
        return this.radius*2*PI;
    }

    @Override
    public String toString() {
        return "Color: "+color+", Fill: "+getFill()+ ", radius: " + radius 
               + ", Area: "+getArea() +", Perimeter: "+getPerimeter();
    }
    
    
}
