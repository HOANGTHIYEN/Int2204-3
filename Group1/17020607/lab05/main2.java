package Week5_2;

public class main2 {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape.toString());
		
		Circle circle = new Circle(5, "red", true);		
		System.out.println(circle.toString());
		
		Rectangle rect = new Rectangle(5, 6);		
		System.out.println(rect.toString());
		
		Square square = new Square(4);		
		System.out.println(square.toString());
	}

}
