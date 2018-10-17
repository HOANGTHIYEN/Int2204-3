package lab06;

public class Main {
 public static void main(String[] args) {
        ToaDo diemA = new ToaDo(0,0);
        ToaDo diemB = new ToaDo(3,0);
        ToaDo diemC = new ToaDo(0,4);
        Triangle t1 = new Triangle(diemA, diemB, diemC);
        System.out.println("Tam giac ban dau\t" + t1.toString());
        t1.move(3, 3);
        System.out.println("Tam giac sau khi dich\t" + t1.toString()+"\n");
        
        Shape r = new Rectangle(3.5 , 5.5 , diemA);
        Shape t = new Triangle(diemA, diemB, diemC);
        
        Shape c = new Circle(5.0 , diemA);
        Shape s = new Square(20, diemA);
        
        Layer layer = new Layer("layer1");
        Layer layer2 = new Layer("layer2");
        layer.addShape(r);
        layer.addShape(t);
        layer.addShape(c);
        layer.addShape(s);
    
        layer2.addShape(t);
        layer2.addShape(c);
        layer2.addShape(s);
        
        Diagram diagram = new Diagram();
        diagram.addLayer(layer);
        diagram.addLayer(layer2);
        System.out.println("Ban dau");
        diagram.showAllLayer();
        System.out.println();
        diagram.removeAllCircle();
        System.out.println("Xoa toan bo Circle trong Diagram");
        diagram.showAllLayer();
        System.out.println();
         System.out.println("Xoa toan bo cac doi tuong Triangle trong Layer");
        diagram.getListLayer().get(0).removeAllTriangle();
        diagram.getListLayer().get(1).removeAllTriangle();
        diagram.showAllLayer();

    }
}