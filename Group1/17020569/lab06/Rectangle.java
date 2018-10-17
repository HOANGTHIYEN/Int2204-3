package lab;

public class Rectangle extends Shape{
    public double width;
    public double length;
    public Pos diemA;

    public Rectangle(double width, double length, Pos diemA) {
        this.width = width;
        this.length = length;
        this.diemA = diemA;
    }

    public Rectangle(double width, double length, String color, boolean filled, Pos diemA) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.diemA = diemA;
    }

   

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

   public double getArea()
    {
        return this.length * this.width;
    }
    public double getPerimeter()
    {
        return 2*(this.length + this.width);
    }
    public void move(int x, int y)
    {
        diemA.setX(diemA.getX() + x);
        diemA.setY(diemA.getY() + y);
    }
    @Override
    public String toString() {
        return "Rectangle : Diem A(" + diemA.getX() + ", "+ diemA.getY() +") Width :" + this.width + " Length :" + this.length + "Area : " +getArea() + "\tPerimeter : " + getPerimeter();
    }  
    
}
