package ex2;
class Shape
{
    
    protected String color="red";
    protected boolean filled=true;
    public Shape(){}
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    @Override
    public String toString()
    {
        return "Shape getColor"+ getColor() + "isFilled"+isFilled();
    }
}
class Circle extends Shape
{
    final double Pi=3.14159;
    protected double radius;
    public Circle(){}
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return 2*Pi*radius;
    }
    public double getPerimeteter()
    {
        return Pi*radius*radius;
    }
    @Override
    public String toString()
    {
        return "Circle getRadius" + getRadius() +" , getPerimeter" +getPerimeteter()+ " getArea"+ getArea();
    }
}
class Rectangle extends Shape
{
    protected double width,length;
    public Rectangle(){}
    public Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length, String color, boolean filled)
    {
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }
    public double getArea()
    {
        return width*length;
    }
    @Override
    public String toString()
    {
        return "Rectangle getWidth" + getWidth() +" , getLength" +getLength()+ " getArea"+ getArea() +"getPerimeter"+getPerimeter();
    }
}
class Square extends Rectangle
{   
    protected double size;
    public Square(double size)
    {
        this.size=size;
        this.width=size;
        this.length=size;
    }
    public double getSize()
    {
        return length;
    }
    public void setSize(double size)
    {
        this.length=size;   
        this.width=size;
    }
    public void setWidth(double size)
    {
        this.width=size;
        this.length=size;
    }
    public void setLength(double size)
    {
        this.width=size;
        this.length=size;
    }
    @Override
    public String toString()
    {
        return "Square getSize" + getSize();
    }
}
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square s= new Square(4);
        s.getArea();
        s.setLength(5);
        s.setWidth(3);
    }
    
}
