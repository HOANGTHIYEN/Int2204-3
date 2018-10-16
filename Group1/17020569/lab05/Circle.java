package lab5;public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14;
    
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r, String n, boolean i){
        this.radius = r;
        this.setColor(n);
        this.setFilled(i);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getArea(){
        return PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*PI*this.radius;
    }
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    }
    
}
