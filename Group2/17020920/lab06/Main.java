 package lab06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagram diagram = new Diagram();
		Layer layer = new Layer();
		layer.setName("Lab06");
		
		Shape C = new Circle();
		System.out.println(C);
		layer.drawCircle(C);
		
		Shape R = new Rectangle();
		System.out.println(R);
		layer.drawRectangle(R);
		
		Shape S = new Square();
		System.out.println(S);
		layer.drawSquare(S);
		
		Shape T = new Triangle();
		System.out.println(T);
		layer.drawTriangle(T);
		
		diagram.setLayer(layer);
		Layer layer2 = diagram.getLayer(layer.getIndex());
		if(layer2.deleteAllTriangle()) {
			System.out.println("thanh cong.");
		}
		diagram.deleteAllCircleInDraw();
	}

}
