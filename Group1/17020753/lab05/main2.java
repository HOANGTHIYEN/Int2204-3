package tuan5_2;

public class main2 {

	public static void main(String[] args) {
		Shape o = new Shape();
		System.out.println(o.toString());
		
		Circle a = new Circle(5, "red", true);		
		System.out.println(a.toString());
		
		Rectangle b = new Rectangle(5, 6);		
		System.out.println(b.toString());
		
		Square c = new Square(4);		
		System.out.println(c.toString());
		
		c.setLength(5);
		System.out.println(c.toString());
		
		c.setWidth(3);
		System.out.println(c.toString());
	}

}
