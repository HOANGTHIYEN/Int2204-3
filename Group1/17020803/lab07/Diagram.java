import java.util.ArrayList;

public class Diagram {

    ArrayList<Layer> diagram = new ArrayList<Layer>();

    public void quy_hoach() {
        Layer ly1 = new Layer(true);
        Layer ly2 = new Layer(true);
        Layer ly3 = new Layer(true);
        Layer ly4 = new Layer(true);
        Layer ly5 = new Layer(true);
        for (Layer ly: diagram)
        {
            for (Shape s: ly.layer) {
                if (s instanceof Circle){
                    ly1.layer.add(new Circle(s.getX(), s.getY(), ((Circle) s).getRadian()));
                }
                else
                if (s instanceof Rectangle) {
                    ly2.layer.add (new Rectangle(s.getX(), s.getY(), ((Rectangle) s).getWidth(), ((Rectangle) s).getLength()));
                }
                else
                if (s instanceof Square) {
                    ly3.layer.add(new Square(s.getX(), s.getY(), ((Square) s).getSize()));
                }
                else
                if (s instanceof Triangle) {
                    ly4.layer.add(new Triangle(s.getX(), s.getY(), ((Triangle) s).getX2(), ((Triangle) s).getY2(),((Triangle) s).getX3(),((Triangle) s).getY3()));
                }
                else
                if (s instanceof Hexagon) {
                    int[] a = ((Hexagon) s).getX1();
                    int[] b = ((Hexagon) s).getY1();
                    int c = s.getX();
                    int d = s.getY();
                    ly5.layer.add(new Hexagon(c,d,a,b));
                }

            }
        }
        diagram.clear();
        diagram.add(ly1);
        diagram.add(ly2);
        diagram.add(ly3);
        diagram.add(ly4);
        diagram.add(ly5);
    }

}