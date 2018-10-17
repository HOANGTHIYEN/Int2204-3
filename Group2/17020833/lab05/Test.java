package community.com;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle(6);
		
		System.out.println(c1);
		System.out.println("color = "+c1.getColor());
		System.out.println("filled = " +c1.isFilled());
		System.out.println("radius = " +c1.getRadius());
		System.out.println("area = "+c1.getArea());
		System.out.println("perimeter = " +c1.getPerimeter());
		
		Rectangle r1= new Rectangle(5,10);
		
		System.out.println(r1);
		System.out.println("color = "+r1.getColor());
		System.out.println("filled = " +r1.isFilled());
		System.out.println("width = " + r1.getWidth());
		System.out.println("length = "+r1.getLength());
		System.out.println("area = "+r1.getArea());
		System.out.println("perimeter = " +r1.getPerimeter());
		
		Square s1= new Square(4);
		
		System.out.println(s1);
		System.out.println("color = "+s1.getColor());
		System.out.println("filled = " +s1.isFilled());
		System.out.println("side = " + s1.getWidth());
		System.out.println("area = "+s1.getArea());
		System.out.println("perimeter = " +s1.getPerimeter());
		s1.setWidth(7);
		s1.setSide(6);
		System.out.println("side = " + s1.getWidth());
		System.out.println("area = "+s1.getArea());
		System.out.println("perimeter = " +s1.getPerimeter());
		
		
		
		
		
	
	
	
	}

}
