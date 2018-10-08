package bt2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle v1 = new Rectangle(4,5);
		System.out.println(v1.toString());
		Shape t1 = new Circle(3);
		System.out.println(t1.toString());
		Square v2 = new Square(5);
		System.out.println(v2.toString());
		System.out.println("---------------------");
		v2.setLength(9);
		System.out.println(v2.toString());
		v2.setWidth(3);
		System.out.println(v2.toString());
	}

}
