 package lab06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagram diagram = new Diagram();
		Layer layer = new Layer();
		
		
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
		
		Point p1 = new Point(10,12);
		Point p2 = new Point(3,4);
		Point p3 = new Point(6,8);
		Point p4 = new Point(1,3);
		Point p5 = new Point(12,15);
		Point p6 = new Point(4,9);
		Shape H = new Hexagon(p1,p2,p3,p4,p5,p6,"white",true,p1);
		System.out.println(H);
		layer.drawHexagon(H);
		
		diagram.setLayer(layer);
		Layer layer2 = diagram.getLayer(layer.getIndex());
		if(layer2.deleteAllTriangle()) {
			System.out.println("thanh cong.");
		}
		diagram.deleteAllCircleInDraw();
	}

}
