package lb5;

public class Circle extends Shape{
    private double radius = 1.0;
    final double PI = 3.14159;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    //Tính diện tích
    public double getArea(){
        return radius*radius*PI;
    }
    //Tính chu vi
    public double getPrimeter(){
        return radius*2*PI;
    }
    //Khởi tạo
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }


    public String toString(){
        return super.toString() + "; Chu vi = " + getPrimeter() + "; Diện tích = " + getArea();
    }

}
