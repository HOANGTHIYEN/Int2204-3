package lab05;

class Shape 
{    
    // The private instance variables
    protected String color;
    protected boolean filled;
    public Shape()
    {
        this.color="red";
        this.filled=true;
    }
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public boolean getFilled() 
    {
        return filled;
    }

    public String toString() 
    {
        return getColor()+"\t"+getFilled();
    }
}

class Circle extends Shape 
{
	protected final double PI = 3.14f;
    protected double radius;
    public Circle(){
        new Shape();
        this.radius=1.0;
    }
    public Circle(double radius)
    {
        new Shape();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {
    	super(color, filled);
    	this.radius=radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea() 
    {
        return PI*getRadius()*getRadius();
    }
    public double getPerimeter()
    {
        return 2*PI*getRadius();
    }
    public String toString()
    {
        return radius + "\t" + super.toString();
    }
}

class Rectangle extends Shape 
{
    protected double width;
    protected double length;
    public Rectangle()
    {
        new Shape();
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length)
    {
        new Shape();
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled)
    {
    	super(color,filled);
        this.width=width;
        this.length=length;
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

class Square extends Rectangle 
{

	public Square() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side ) 
	{
		super(side,side);
		// TODO Auto-generated constructor stub
	}

	public Square(String color, boolean filled, double side) 
	{
		super(side,side,color,filled);
		// TODO Auto-generated constructor stub
	}
	public double getSide ()
	{
		return super.getWidth();
	}
	public void setSide (double side)
	{
		width = side;
		length =side;
	}
	public void setWidth(double side)
	{
		setSide(side);
	}
	public void setLength(double side)
	{
		setSide(side);
	}
	public String toString()
	{
		return "Square "+super.toString();
	}
}

public class Cau_2 {
	public static void main(String[] args){
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("pink",false);
        System.out.println(shape2);

        shape1.setColor("blue");
        shape1.setFilled(true);
        System.out.println(shape1);// toString() to inspect the modified instance
        System.out.println("The color: " + shape1.getColor());
        System.out.println("The filled: " + shape1.getFilled());

        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(4.5);
        System.out.println(circle2);
        Circle circle3 = new Circle(3.65,"green",false);
        System.out.println(circle3);

        circle1.setRadius(2.67);
        circle1.setColor("black");
        circle1.setFilled(true);
        System.out.println(circle1);
        System.out.println("The radius: " + circle1.getRadius());
        System.out.println("The color: " + circle1.getColor());
        System.out.println("The filled: " + circle1.getFilled());

        System.out.printf("The area: %.2f%n", circle1.getArea());
        System.out.printf("The perimeter: %.2f%n", circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(3.2,6.7);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(4.6,5.2,"yellow",true);
        System.out.println(rectangle3);

        rectangle1.setWidth(9.6);
        rectangle1.setLength(10.6);
        rectangle1.setColor("white");
        rectangle1.setFilled(false);
        System.out.println(rectangle1);
        System.out.println("The width: " + rectangle1.getWidth());
        System.out.println("The length: " + rectangle1.getLength());
        System.out.println("The color: " + rectangle1.getColor());
        System.out.println("The filled: " + rectangle1.getFilled());

        System.out.printf("The area: %.2f%n", rectangle1.getArea());
        System.out.printf("The perimeter: %.2f%n", rectangle1.getPerimeter());

        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(6.7);
        System.out.println(square2);

        square1.setSide(7.9);
        square1.setWidth(11.6);
        square1.setColor("pink");
        square1.setFilled(false);
        System.out.println(square1);
        System.out.println("The color: " + square1.getColor());
        System.out.println("The filled: " + square1.getFilled());

        System.out.printf("The area: %.2f%n", square1.getArea());
        System.out.printf("The perimeter: %.2f%n", square1.getPerimeter());
    }
}
