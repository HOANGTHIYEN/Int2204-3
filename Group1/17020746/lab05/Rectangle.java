package lb5;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPrimeter(){
        return (width+length)*2;
    }

    public Rectangle(){}
    //Khởi tạo
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public String toString(){
        return super.toString() + "; Chu vi = " + getPrimeter() + "; Diện tích = " + getArea();
    }
}
