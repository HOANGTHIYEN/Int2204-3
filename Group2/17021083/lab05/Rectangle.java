public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(){
        new Shape();
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length){
        new Shape();
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        super.setColor(color);
        super.setFilled(filled);
        new Shape(super.getColor(),super.getFilled());
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return width+"\t"+length+"\t"+super.toString();
    }
}
