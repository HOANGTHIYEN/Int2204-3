import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class Main extends JFrame{
    public Main() {
        setTitle("lab07");
        setVisible(true);
        setSize(1000, 900);
    }
    public void paint(Graphics g) {
        super.paint(g);
        Diagram dg = new Diagram();
        Layer lr = new Layer(true);
        lr.layer.add(new Circle(500,500,200));
        lr.layer.add(new Circle(100,500,300));
        lr.layer.add(new Square(600,600,100));
        lr.layer.add(new Rectangle(150,150,200,300));
        lr.layer.add(new Triangle(100,100,130,150,180,100));
        int [] a1 = {200,300,400,400,300};
        int [] a2 = {500,600,500,300,200};
        lr.layer.add(new Hexagon(200,300,a1,a2));
        lr.setVisiable(true);
        lr.xoa_hinh_trung();
        dg.diagram.add(lr);
        dg.quy_hoach();
        //dg.diagram.get(0).setVisiable(false);
        //dg.diagram.get(1).setVisiable(false);
        for (Layer ly: dg.diagram) {
            if (ly.getVisiable() == true) {
                for (Shape s: ly.layer) {
                    if (s instanceof Circle)
                        g.drawOval(s.getX(), s.getY(), ((Circle) s).getRadian(), ((Circle) s).getRadian());
                    if (s instanceof Square)
                        g.drawRect(s.getX(), s.getY(), ((Square) s).getSize(), ((Square) s).getSize());
                    if (s instanceof Rectangle)
                        g.drawRect(s.getX(), s.getY(), ((Rectangle) s).getWidth(), ((Rectangle) s).getLength());
                    if (s instanceof Triangle) {
                        g.drawLine(s.getX(),s.getY(),((Triangle) s).getX2(),((Triangle) s).getY2());
                        g.drawLine(s.getX(),s.getY(),((Triangle) s).getX3(),((Triangle) s).getY3());
                        g.drawLine(((Triangle) s).getX2(),((Triangle) s).getY2(),((Triangle) s).getX3(),((Triangle) s).getY3());
                    }
                    if (s instanceof Hexagon ) {
                        int x = s.getX();
                        int y = s.getY();
                        int []x1 = ((Hexagon) s).getX1();
                        int []y1 = ((Hexagon) s).getY1();
                        g.drawLine(x, y, x1[0], y1[0]);
                        g.drawLine(x1[1], y1[1], x1[0], y1[0]);
                        g.drawLine(x1[2], y1[2], x1[1], y1[1]);
                        g.drawLine(x1[3], y1[3], x1[2], y1[2]);
                        g.drawLine(x1[4], y1[4], x1[3], y1[3]);
                        g.drawLine(x1[4], y1[4], x, y);
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        new Main();
    }
}