public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }
     public double getArea(){
        return this.radius * this.radius * 3.14;
     }

     public double getPerimeter(){
        return this.radius * 2 * 3.14;
     }

     public String toString(){
        return this.radius + " " + this.getColor() + " " + this.isFilled();
     }
}