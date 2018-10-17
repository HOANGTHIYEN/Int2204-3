package JavaWeek6;

public class Main {
	public static void main(String[] args) {
		Layer test = new Layer();
		Diagram dia = new Diagram();
		Rectangle hcn1 = new Rectangle();
		Triangle tamgiac1 = new Triangle();
		Circle hinhtron1 = new Circle();
		// trước khi xóa hình tam giác

		test.add(hcn1);
		test.add(tamgiac1);
		test.add(hinhtron1);
		System.out.println("\n\t\t----------TEST eraseTriangle----------\n");
		System.out.println("List có " + test.size() + " phần tử ");
		for (Shape beforeErase : test) {
			System.out.println(beforeErase.getInfo());
		}
		// test eraseTriangle
		test.eraseTriangle();
		System.out.println("\nSau khi xóa hình tam giác list có " + test.size() + " phần tử ");
		for (Shape afterErase : test) {
			System.out.println(afterErase.getInfo());
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------\n");
		
		// test eraseCircle
		
		// trước khi xóa hình tròn
		Square hv1 = new Square();
		dia.add(hcn1);
		dia.add(hv1);
		dia.add(tamgiac1);
		dia.add(hinhtron1);
		System.out.println("\n\t\t----------TEST eraseCircle----------\n");
		System.out.println("List có " + dia.size() + " phần tử ");
		for (Shape beforeErase : dia) {
			System.out.println(beforeErase.getInfo());
		}
		// sau khi xóa
	    dia.eraseCircle();
		System.out.println("\nSau khi xóa hình tròn list có " + dia.size() + " phần tử ");
		for (Shape afterErase : dia) {
			System.out.println(afterErase.getInfo());
		}
		
		// test hàm di chuyển
		
		hv1.setHeart(1, 1);
		hv1.Move("up", 2);
		System.out.println(hv1.getHeart());
		
		
	}
}
