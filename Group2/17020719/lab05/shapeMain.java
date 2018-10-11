    import java.sql.SQLOutput;

class shape{
    protected String color;
    protected boolean filled;
    shape(){
        color = "red";
        filled = true;
    }
    shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return true;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Color: " + color + "\nFilled: " + filled;
    }
}

class circle extends shape{
    protected double radius;
    final double PI = 3.14;
    circle(){
        radius = 1.0;
    }
    circle(double radius){
        this.radius = radius;
    }
    circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * PI;
    }
    public double getPerimeter(){
        return radius * 2 * PI;
    }
    @Override
    public String toString(){
        String str = super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        return str;
    }
}

class rectangle extends shape{
    protected double width;
    protected double length;
    rectangle(){
        width = 1.0;
        length = 2.0;
    }
    rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
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
        return width * length;
    }
    public double getPerimeter(){
        return (width + length) * 2;
    }
    @Override
    public String toString(){
        String str = super.toString() + "\nWidth: " + width + "\nLength: " + length + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        return str;
    }
}

class square extends rectangle{
    @Override
    public void setWidth(double side) {
       this.width = side;
       this.length =side;
    }
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }
     square() {
        super();
    }
     square(double side){
        super(side, side);
    }
    square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public String toString(){
        String str = super.toString();
        return str;
    }
}

public class shapeMain {
    public static void main(String[] args) {
        shape sh = new shape();
        System.out.println(sh);

        circle circ = new circle();
        System.out.println("\n" + circ);

        rectangle rtg = new rectangle(1, 2);
        System.out.println("\n" + rtg);

        square sq = new square(2);
        System.out.println("\n" + sq);

        square sq2 = new square(5);
        System.out.println("\n" + sq2);
    }
}
