package lab05;

public class bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Shape");
        Shape o1 = new Shape();
        Shape o2 = new Shape("blue",false);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println("----------------------");
        System.out.println("Circle");
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.4);
        Circle c3 = new Circle(7.3,"yellow",false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("----------------------");
        System.out.println("Rectangle");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.2, 4.8);
        Rectangle r3 = new Rectangle(6.4, 5.3, "black", false);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("----------------------");
        System.out.println("Square");
        Square s1 = new Square();
        Square s2 = new Square(6.0);
        Square s3 = new Square(8.1, "white", false);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
	

}
