package JavaWeek5;

public class Main02 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		// Hình tròn 1
		Ex2_Circle circle1 = new Ex2_Circle();
		System.out.print("Nhập bán kính hình tròn 1: ");
		circle1.setRadius(Double.parseDouble(sc.nextLine()));
		System.out.print("Hình tròn 1 có diện tích là: " + circle1.getArea());
		System.out.print("\nHình tròn 1 có chu vi là: " + circle1.getPerimeter());
		System.out.println(circle1.toString());
		
		// Hình tròn 2
		System.out.print("\nNhập bán kính hình tròn 2: ");
		Ex2_Circle circle2 = new Ex2_Circle(Double.parseDouble(sc.nextLine()));
		System.out.print("Hình tròn 2 có diện tích là: " + circle2.getArea());
		System.out.print("\nHình tròn 2 có chu vi là: " + circle2.getPerimeter());
		circle2.setColor("blue"); // in class shape
		System.out.println(circle2.toString());
		
		// Hình tròn 3		
		System.out.print("\nNhập bán kính hình tròn 3: ");
		Ex2_Circle circle3 = new Ex2_Circle(Double.parseDouble(sc.nextLine()), "green", false);
		System.out.print("Hình tròn 3 có diện tích là: " + circle3.getArea());		
		System.out.print("\nHình tròn 3 có chu vi là: " + circle3.getPerimeter());
		System.out.println(circle3.toString());
		
		// Hình chứ nhật 1
		Ex2_Ractangle rac1 = new Ex2_Ractangle();
		System.out.print("\nNhập chiều rộng hình chữ nhật 1: ");
		rac1.setWidth(Double.parseDouble(sc.nextLine()));
		System.out.print("Nhập chiều dài hình chữ nhật 1: ");
		rac1.setLength(Double.parseDouble(sc.nextLine()));
		System.out.println("Hình chữ nhật 1 có diện tích là: " + rac1.area(rac1.getWidth(),rac1.getLength()));
		System.out.print("Hình chữ nhật 1 có chu vi là: " + rac1.perimeter(rac1.getWidth(),rac1.getLength()));
		sc.close();
		*/
		Ex2_Square square = new Ex2_Square();
		Ex2_Ractangle rac1 = new Ex2_Ractangle();
		rac1.setWidth(5);
		rac1.setLength(6);
		square.setSize(5);
		System.out.println(square.area());
		System.out.println(rac1.area());
	}

}
