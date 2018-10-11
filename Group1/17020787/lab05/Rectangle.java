package lap5;
class Rectangle extends Shape {
    protected double Width ;
    protected double length ;
    public  Rectangle(){
        this.Width=1.0;
        this.length=1.0;
    }
    public Rectangle(String color, Boolean filled, double width,double length) {
        super(color, filled);
        this.Width = width;
        this.length=length;
    }

    public Rectangle(double width, double length) {
        this.Width = width;
        this.length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.Width*this.length;
    }
    public  double getPerimeter(){
        return (this.Width+this.length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Width=" + Width +
                ", length=" + length +
                '}';
    }
}
