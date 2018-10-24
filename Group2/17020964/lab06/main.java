package lab6;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape tri1 = new Triage(4, 3, 5);
		Shape tri2 = new Triage(2, 1, 3);
		Shape Cr1 = new Cirle(3, 2, 5.3);
		Shape Cr2 = new Cirle(2, 3, 5.5);
		Shape Sq1 = new Square(2, 3);
		Layer layer = new Layer();
		layer.listLayer.add(tri1);
		layer.listLayer.add(tri2);
		layer.listLayer.add(Sq1);
		for(int i=0;i<layer.listLayer.size();i++) {
			System.out.println("Các phần tử layer trước khi xóa");
			System.out.println(layer.listLayer.get(i).toString());
		}
		layer.erase(layer.listLayer);
		for(int i=0;i<layer.listLayer.size();i++) {
			System.out.println("Các phần tử layer sau khi xóa");
			System.out.println(layer.listLayer.get(i).toString());
		}
		Diagram Dia = new Diagram();
		Dia.listDia.add(Cr2);
		Dia.listDia.add(Cr1);
		Dia.listDia.add(tri1);

	}

}
