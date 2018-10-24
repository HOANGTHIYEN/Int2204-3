package lap07;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
            EventQueue.invokeLater( () -> {     //invokeLater() -> chạy chương trình trong một luồng do EventQueue quản lý.
                    Diagram rendered = new Diagram();
                    Layer layer = new Layer();
                    Layer layernull = new Layer();
                    Layer layervisible = new Layer();

                    Location p1 = new Location(0,0);
                    Location p2 = new Location(100,0);
                    Location p3 = new Location(90,100);
                    Location A = new Location(100,100);
                    Location B = new Location(0,200);
                    Location C = new Location(100,300);
                    Location D = new Location(200,300);
                    Location E = new Location(300,200);
                    Location F = new Location(200,100);
                    Location G = new Location(10,10);
                    Location H = new Location(0,20);
                    Location J = new Location(10,30);
                    Location K = new Location(20,30);
                    Location L = new Location(30,20);
                    Location M = new Location(20,10);
                    layer.addShape(new Circle(150));
                    layer.addShape(new Rectangle(300,300));
                    layer.addShape(new Square(10,10,Color.BLACK,false,30));
                    layer.addShape(new Triangle(p1,p2,p3));
                    layer.addShape(new Hexagon(A,B,C,D,E,F));

                    layernull.addShape(new Hexagon(G,H,J,K,L,M));
                    layernull.getShape(0).reColor(Color.RED);

                    layervisible.addShape(new Circle(150));
                    layervisible.addShape(new Circle(150));
                    layervisible.addShape(new Circle(150));
                    layervisible.getShape(0).reColor(Color.BLUE);

                    layervisible.addShape(new Square(200));
                    layervisible.addShape(new Square(200));
                    layervisible.addShape(new Rectangle(100,300));

                    layervisible.clearAllMatch();
                    layernull.clearAllMatch();
                    layer.clearAllMatch();

                    layervisible.getShape(1).reColor(Color.RED);
                    layer.getShape(4).reColor(Color.BLACK);

                    rendered.addLayer(layer);
                    rendered.addLayer(layernull);
                    rendered.addLayer(layervisible);
                    rendered.getLayer(0).getShape(3).remove(30, 20);
                    rendered.reOrganized();
                    rendered.getLayer(1).getShape(1).reColor(Color.GREEN);;
                });
            }
}

