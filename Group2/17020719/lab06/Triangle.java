import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    protected double side1, side2, side3;

    public double getSide1(){
        return side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }

    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }

    public double getSide3(){
        return side3;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    public Triangle(){
        this.side1 = 3.0;
        this.side2 = 4.0;
        this.side3 = 5.0;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled, Point point){
        super(color, filled, point);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter(){
        return (side1 + side2 + side3)/2;
    }
    public double getArea(){
        double p = getPerimeter();
        return sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString(){
        String str = "Triangle\n" + super.toString() + "\nSide1: " + side1 + "\nSide2: " + side2 + "\nSide3: " + side3 + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        return str;
    }
}
