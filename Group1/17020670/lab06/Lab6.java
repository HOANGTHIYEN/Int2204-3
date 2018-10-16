
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Vector;

class toaDo {

    private double x, y;

    public toaDo() {
    }

    public toaDo(double x, double y) {
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

abstract class Shape {

    protected String color = "red";         //chi truy cap ben ngoai class khi co tinh ke thua
    protected boolean filled = true;
    protected toaDo toaDoTam = new toaDo(3, 5);

    public Shape() {

    }

    /*constructor*/
    public Shape(String color, boolean filled, toaDo toaDoTam) {
        this.color = color;
        this.filled = filled;
        this.toaDoTam = toaDoTam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }               //getFiller

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public toaDo getToaDoTam() {
        return toaDoTam;
    }

    public void setToaDoTam(toaDo toaDoTam) {
        this.toaDoTam = toaDoTam;
    }

    public void Move(double x, double y) {
        toaDoTam.setX(x);
        toaDoTam.setY(y);
    }

    public void getinfo() {
        System.out.println("");
    }
}

class Circle extends Shape {

    protected double radius = 1.0;
    protected final double PI = 3.14;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /*constructor*/
    public Circle(double radius, String color, boolean filled, toaDo toaDoTam) {
        super(color, filled, toaDoTam);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    public void getinfo() {
        System.out.println("Circle:\tR = " + radius);
    }

    public void Move(toaDo t) {
        this.toaDoTam = t;
    }
}

class Rectangle extends Shape {

    protected toaDo A;
    protected toaDo B;
    protected toaDo C;
    protected toaDo D;

    public Rectangle() {
        super();
    }

    public Rectangle(toaDo a, toaDo b, toaDo c, toaDo d) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }

    public Rectangle(toaDo a, toaDo b, toaDo c, toaDo d, String color, boolean filled, toaDo toaDoTam) {
        super(color, filled, toaDoTam);       //tham chiếu trực tiếp đến biến instance của lớp cha.
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }

    public toaDo getA() {
        return this.A;
    }

    public void setA(toaDo a) {
        this.A = a;
    }

    public toaDo getB() {
        return this.B;
    }

    public void setB(toaDo b) {
        this.B = b;
    }

    public toaDo getC() {
        return this.C;
    }

    public void setC(toaDo c) {
        this.C = c;
    }

    public toaDo getD() {
        return this.D;
    }

    public void setD(toaDo d) {
        this.D = d;
    }

    public double getW() {
        return sqrt(pow((this.A.getX() - this.B.getX()), 2) + pow((this.A.getY() - this.B.getY()), 2));
    }

    public double getL() {
        return sqrt(pow((this.A.getX() - this.C.getX()), 2) + pow((this.A.getY() - this.C.getY()), 2));
    }

    public double getArea() {
        return this.getL() * this.getW();
    }

    public double getPerimeter() {
        return 2 * (this.getL() + this.getW());

    }

    public void getinfo() {
        System.out.println("Rectangle  S = " + this.getArea() + "    C = " + this.getPerimeter());
    }

    public void Move(toaDo a, toaDo b, toaDo c, toaDo d) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.setD(d);
    }
     public void toaDoDiem(){
        System.out.println(this.A.getX()+" ; "+ this.A.getY() +"\t\t"+this.B.getX()+" ; "+ this.B.getY() +"\t\t"+this.C.getX()+" ; "+ this.C.getY() +"\t\t" +this.D.getX()+" ; "+ this.D.getY() +"\t\t");
    }
}

class Square extends Rectangle {

    protected Square() {
        super();
    }

    public Square(toaDo a, toaDo b, toaDo c, toaDo d) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }

    public Square(toaDo a, toaDo b, toaDo c, toaDo d, String color, boolean filled, toaDo toaDoTam) {
        super(a, b, c, d, color, filled, toaDoTam);
    }

    public toaDo getA() {
        return this.A;
    }

    public void setA(toaDo a) {
        this.A = a;
    }

    public toaDo getB() {
        return this.B;
    }

    public void setB(toaDo b) {
        this.B = b;
    }

    public toaDo getC() {
        return this.C;
    }

    public void setC(toaDo c) {
        this.C = c;
    }

    public toaDo getD() {
        return this.D;
    }

    public void setD(toaDo d) {
        this.D = d;
    }

    public double getSize() {
        return sqrt(pow((this.A.getX() - this.B.getX()), 2) + pow((this.A.getY() - this.B.getY()), 2));
    }

    public double getArea() {
        return this.getSize() * this.getSize();
    }

    public double getPerimeter() {
        return 4 * this.getSize();

    }

    public void getinfo() {
        System.out.println("Square  S = " + this.getArea() + "    C = " + this.getPerimeter());
    }

    public void Move(toaDo a, toaDo b, toaDo c, toaDo d) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.setD(d);
    }
    public void toaDoDiem(){
        System.out.println(this.A.getX()+" ; "+ this.A.getY() +"\t\t"+this.B.getX()+" ; "+ this.B.getY() +"\t\t"+this.C.getX()+" ; "+ this.C.getY() +"\t\t" +this.D.getX()+" ; "+ this.D.getY() +"\t\t");
    }
}

class Triangle extends Shape {

    protected toaDo A, B, C;

    protected Triangle() {
        super();
    }

    public Triangle(toaDo A, toaDo B, toaDo C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    /*constructer*/
    public Triangle(toaDo a, toaDo b, toaDo c, String color, boolean filled, toaDo toaDoTam) {
        super(color, filled, toaDoTam);
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public toaDo getA() {
        return A;
    }

    public void setA(toaDo A) {
        this.A.setX(A.getX());
        this.A.setY(A.getY());
    }

    public toaDo get() {
        return B;
    }

    public void setB(toaDo B) {
        this.B.setX(B.getX());
        this.B.setY(B.getY());
    }

    public toaDo getC() {
        return C;
    }

    public void setC(toaDo C) {
        this.C.setX(C.getX());
        this.C.setY(C.getY());
    }

    public double canh1() {
        return sqrt(pow((this.A.getX() - this.B.getX()), 2) + pow((this.A.getY() - this.B.getY()), 2));
    }

    public double canh2() {
        return sqrt(pow((this.C.getX() - this.B.getX()), 2) + pow((this.C.getY() - this.B.getY()), 2));
    }

    public double canh3() {
        return sqrt(pow((this.A.getX() - this.C.getX()), 2) + pow((this.A.getY() - this.C.getY()), 2));
    }

    public double getArea() {
        double p = (this.canh1() + this.canh2() + this.canh3()) / 2;
        return sqrt(p * (p - this.canh1()) * (p - this.canh2()) * (p - this.canh3()));         
    }

    public double getPerimeter() {
        return (this.canh1() + this.canh2() + this.canh3());
    }

    public void getinfo() {
        System.out.println("Tritangle  S = " + this.getArea() + "    C = " + this.getPerimeter());
    }
    public void toaDoDiem(){
        System.out.println(this.A.getX()+" ; "+ this.A.getY() +"\t\t"+this.B.getX()+" ; "+ this.B.getY() +"\t\t"+this.C.getX()+" ; "+ this.C.getY() +"\t\t");
    }
    public void Move(toaDo a, toaDo b, toaDo c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);

    }
}

class Layer extends Vector<Shape> {

    public Layer(int initialCapacity) {
        super(initialCapacity);     //gọi hàm khởi tạo của lớp Shape
    }

    public Layer() {
        super(0);
    }       

    public void deleteTriangle() {
        for (int i = 0; i < this.size(); i++) 
        {
            if (this.elementAt(i) instanceof Triangle) {     
                this.remove(i);         
                i--;
            }
        }

    }
}

class Diagram extends Vector<Layer> {

    public Diagram() {
        super(0);
    }          

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }           

    public void deleteCircle() {
        for (int i = 0; i < this.size(); i++) {     // chay trong lop Shape
            for (int j = 0; j < this.elementAt(i).size(); j++) // chay trong lop Layer
            {
                if (this.elementAt(i).elementAt(j) instanceof Circle) {       
                    this.elementAt(i).remove(j);            
                    j--;       

                }
            }
        }

    }
}

public class Lab6 {

    public static void main(String[] args) {

        Diagram tri = new Diagram();
        Layer tri1 = new Layer();

        toaDo A = new toaDo(0, 0);
        toaDo B = new toaDo(4, 0);
        toaDo C = new toaDo(0, 4);
        toaDo D = new toaDo(4, 4);
        toaDo E = new toaDo(0, 8);
        toaDo F = new toaDo(8, 8);
        
         //them  vao vector
        tri1.add(new Triangle(A, B, C));          
        tri1.add(new Circle(4));
        tri1.add(new Rectangle(A, B, E, F));
        tri1.add(new Square(A, B, C, D));
        
        // test thu Layer
        System.out.println("\n\n");
        System.out.println("Truoc khi xoa: ");
        for (int i = 0; i < tri1.size(); i++) {
            tri1.elementAt(i).getinfo();
        }

        tri1.deleteTriangle();  //xoa Tam giac
        System.out.println("\nSau khi xoa Tam giac: ");

        for (int j = 0; j < tri1.size(); j++) {
            tri1.elementAt(j).getinfo();
        }

        tri.add(tri1);  // them cac doi tuong cua lop Layer vao lop Diagram
        
        //test voi Diagram
        System.out.println("\n\n");
        Layer tri2 = new Layer();
        tri2.add(new Circle(9));
        tri2.add(new Circle(12));
        tri2.add(new Rectangle(A, B, E, F));
        tri2.add(new Triangle(A, B, C));
        
        tri.add(tri2);  //them doi tuong cua Layer vao lop Diagram
        System.out.println("Truoc khi xoa Hinh tron: ");
        for (int i = 0; i < tri.size(); i++) {
            for (int j = 0; j < tri.elementAt(i).size(); j++) {
                tri.elementAt(i).elementAt(j).getinfo();
            }
        }
        tri.deleteCircle();     //xoa Hinh tron
        System.out.println("\nSau khi xoa Hinh tron: ");
        for (int i = 0; i < tri.size(); i++) {
            for (int j = 0; j < tri.elementAt(i).size(); j++) {
                tri.elementAt(i).elementAt(j).getinfo();
            }
        }
        
        // test dich chuyen hinh
        System.out.println("\n\n");
        System.out.println("Truoc khi di chuyen hinh vuong: ");
        System.out.println("4 diem: ");
        Square S1 = new Square (A, B, C, D);
        S1.toaDoDiem();
        
        S1.Move(C, D, E, F); // di chuyen hinh vuong S1
        System.out.println("\nSau khi di chuyen hinh vuong: ");
        System.out.println("4 diem: ");
        S1.toaDoDiem();
    }
}
