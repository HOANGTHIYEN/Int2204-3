package Lap5_ex2;

public class Main_2 {
    public static void main(String args[]){
        System.out.println("Shape");
        Shape o1 = new Shape();
        Shape o2 = new Shape("blue",false);
        System.out.println(o1);
        System.out.println(o2);

        System.out.println("Circle");
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.2);
        Circle c3 = new Circle(3.2,"yellow",true);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Rectangle");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.5, 4.8);
        Rectangle r3 = new Rectangle(3.6, 5.3, "black", true);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("Square");
        Square s1 = new Square();
        Square s2 = new Square(3.0);
        Square s3 = new Square(4.0, "green", false);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    }
