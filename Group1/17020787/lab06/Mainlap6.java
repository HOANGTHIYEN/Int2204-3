package lap6;
//import javax.swing.;
//import java.awt.*;

public class Mainlap6 {
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        //xoa hinh tam giac
        Layer layer = new Layer();
        layer.add(new Triangle(3, 4, 5));
        layer.add(new Cricle(3));
        layer.add(new Rectangle(4, 5));
        layer.add(new Square(5));
        layer.elementAt(0).dichuyen(1, "phai");
        layer.elementAt(1).dichuyen(1, "tren");
        System.out.println("truoc khi xoa tam giac");
        for (int j = 0; j < layer.size(); j++)
            System.out.println(layer.elementAt(j).toString());
        layer.removeTriangle();
        System.out.println("\nSau khi xoa hinh tam giac: \n");
        for (int j = 0; j < layer.size(); j++)
            System.out.println(layer.elementAt(j).toString());
        //test diagram
        diagram.add(layer);
        Layer layer1 = new Layer();
        layer1.add(new Cricle(3));
        layer1.add(new Cricle(2));
        layer1.add(new Triangle(3, 5, 2.5));
        diagram.add(layer1);
        System.out.println("\nTruoc khi xoa hinh tron:\n");
        for (int j = 0; j < diagram.size(); j++) {
            for (int k = 0; k < diagram.elementAt(j).size(); k++)
                System.out.println(diagram.elementAt(j).elementAt(k).toString());
            System.out.println("");
        }
        //test xoa hinh tron
        diagram.removeCricle();
        System.out.println("\nSau khi xoa hinh tron:\n");
        for (int j = 0; j < diagram.size(); j++) {
            for (int k = 0; k < diagram.elementAt(j).size(); k++)
                System.out.println(diagram.elementAt(j).elementAt(k).toString());
            System.out.println("");
        }
    }
}
        /*public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.add(new TestPane());
            frame.pack();
            frame.setVisible(true);
        }
        class TestPane extends JFrame{
            Polygon poly;
            public TestPane(){
                poly=new Polygon(new);

            }





        }

    }*/


