package lab06;
import java.util.Vector;

class Toado
{
    private double x, y;

    public Toado() {
    }

    public Toado(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
abstract class Shape
{
    protected String color;
    protected boolean filled;
    protected Toado tam;
    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled, Toado tam) {
        this.color = color;
        this.filled = filled;
        this.tam = tam;
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

    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }
    public void dichuyen(double dodai, String huong){
        switch (huong) {
            case "len":
                tam.setY(tam.getY() + dodai);
                break;
            case "xuong":
                tam.setY(tam.getY() - dodai);
                break;
            case "phai":
                tam.setX(tam.getX() + dodai);
                break;
            case "trai":
                tam.setX(tam.getX() - dodai);
                break;
            default:
                break;
        }
    }
    public void info(){
        System.out.println("");
    }
}
@SuppressWarnings("serial")
class Layer extends Vector <Shape>
{

    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }
    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
}
@SuppressWarnings("serial")
class Diagram extends Vector<Layer>
{

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void eraseCircle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Circle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}
class Circle extends Shape
{
	protected Toado tam;
    protected double radius;
    final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius,Toado tam) {
        this.radius = radius;
        this.tam=tam;
    }

    public Circle(double radius, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    } 
    
    public void info(){
        System.out.println("Circle: (tam, ban kinh) " + tam + radius);
    }
}

class Rectangle extends Shape
{
	protected Toado d1,d2,d3,d4;
    protected Toado[] tg = new Toado[4];

    public Rectangle() {
    }

    public Rectangle(Toado d1, Toado d2, Toado d3,Toado d4) {
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.d4=d4;
    }

    public Rectangle(Toado d1, Toado d2, Toado d3,Toado d4, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
    }
    
    public Toado getd1() {
        return d1;
    }

    public void setd1(Toado d1) {
        this.d1=d1;
        
    }

    public Toado getd2() {
        return d2;
    }

    public void setd2(Toado d2) {
    	this.d2=d2;
    }

    public Toado getd3() {
        return d3;
    }

    public void setd3(Toado d3) {
    	this.d3=d3;
    }
    public Toado getd4() {
        return d1;
    }

    public void setd4(Toado d4) {
        this.d4=d4;
        
    }
    public void info(){
        System.out.println("Triangel: (4 dinh) " + d1 + " " + d2 + " " + d3 + " " +d4);
    }
}
class Triangle extends Shape
{
    protected Toado d1,d2,d3;
    protected Toado[] tg = new Toado[3];

    public Triangle() {
    }

    public Triangle(Toado d1, Toado d2, Toado d3) {
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }

    public Triangle(Toado d1, Toado d2, Toado d3, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public Toado getd1() {
        return d1;
    }

    public void setd1(Toado d1) {
        this.d1=d1;
        
    }

    public Toado getd2() {
        return d2;
    }

    public void setd2(Toado d2) {
    	this.d2=d2;
    }

    public Toado getd3() {
        return d3;
    }

    public void setd3(Toado d3) {
    	this.d3=d3;
    }
    public void info(){
        System.out.println("Triangel: (3 dinh) " + d1 + " " + d2 + " " + d3);
    }
}

public class lab06 
{

    public static void main(String[] args) {
        Diagram d = new Diagram();
        //test eraseTriangle
        Triangle t1 = new Triangle();
        t1.d1.setX(0);
        t1.d1.setY(1);
        t1.d2.setX(0);
        t1.d2.setY(4);
        t1.d3.setX(4);
        t1.d3.setY(1);
        Circle c1 = new Circle();
        c1.tam.setX(0);
        c1.tam.setY(1);
        c1.setRadius(2);
        Rectangle r1 = new Rectangle();
        r1.d1.setX(0);
        r1.d1.setY(1);
        r1.d2.setX(0);
        r1.d2.setY(4);
        r1.d3.setX(4);
        r1.d3.setY(1);
        r1.d4.setX(4);
        r1.d4.setY(4);
        Layer l1 = new Layer();
        l1.add(t1);
        l1.add(c1);
        l1.add(r1);
        d.add(l1);
        for(int j = 0;j < l1.size();j ++)
            l1.elementAt(j).info();
        l1.eraseTriangle();
        System.out.println("\nSau khi xoa hinh tam giac:");
        for(int j = 0;j < l1.size();j ++)
            l1.elementAt(j).info();
        d.eraseCircle();
        System.out.println("\nSau khi xoa hinh tron:");
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k < d.elementAt(j).size();k ++)
                d.elementAt(j).elementAt(k).info();
        }
    }
    
}
