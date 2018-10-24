package lab6;


class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
     public Rectangle(double width, double length, String color, boolean filled, location mid) {
        super(color, filled, mid);
        this.width = width;
        this.length = length;
    }
     public double getWidth() {
        return width;
    }
     public void setWidth(double width) {
        this.width = width;
    }
     public double getLength() {
        return length;
    }
     public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width + length)*2;
    }
    public void show(){
        System.out.println("Hinh chu nhat: " + length + " " + width +" "+color+" "+mid);
    }
    
}