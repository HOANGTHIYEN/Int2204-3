package lab05;

public class Circle extends Shape{
	protected double radius;
    protected final double PI = 3.14;
    
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r, String n, boolean i){
    	super(n, i);
        this.radius = r;
        
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    //tinh dien tich
    public double getArea(){
        return PI*this.radius*this.radius;
    }
    //tinh chu vi
    public double getPerimeter(){
        return 2*PI*this.radius;
    }
    @Override
    public String toString(){
        return "Mau: " + this.getColor()+" - Fill:"+this.isFilled()+" - Dien tich: "+this.getArea()+" - Chu vi:"+this.getPerimeter();
    }
}
