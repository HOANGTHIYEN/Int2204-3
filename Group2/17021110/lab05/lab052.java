package lab052;
class Shape{
     String color = "red";
     boolean filled = true;
    
    public Shape(){
        
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return color + " " + filled;
    }
}
class Cricle extends Shape{
     double radius = 1.0;
    final double pi = 3.14;
    public Cricle(){
        
    }
    public Cricle(double radius){
        this.radius = radius;
    }
    public Cricle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    @Override
    public String toString(){
        return radius + " " + color + " " + filled;
    }
}
class Rectangle extends Shape{
     double width = 1.0, length = 1.0;
    public Rectangle(){
        
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
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
    @Override
    public String toString(){
        return width + " " + length + " " + color + " " + filled;
    }
    
}
class Square extends Rectangle{
     double side;
    public Square(){
        
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.width=side;
        this.length=side;
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side=side;
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side=side;
    }
    @Override
    public String toString(){
        return side + " " + color + " " + filled;
    }
}             
public class Lab052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape t1 = new Shape("red", true);
        System.out.println(t1.toString());
        
        
        Cricle t2 = new Cricle(4.0);
        System.out.println(t2.getArea());
        System.out.println(t2.getPerimeter());
        System.out.println(t2.toString());
        
        
        Rectangle t3 = new Rectangle(4.0, 8.0);
        System.out.println(t3.getArea());
        System.out.println(t3.getPerimeter());
        System.out.println(t3.toString());
        
        
        Square t4 = new Square();
        t4.setLength(10);
        t4.setLength(t4.getSide());
        t4.setWidth(t4.getSide());
        System.out.println(t4.getArea());
        System.out.println(t4.getPerimeter());
        System.out.println(t4.toString());
    }
    
}
