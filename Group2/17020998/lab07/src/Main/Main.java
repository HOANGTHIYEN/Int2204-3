package Main;

public class Main {
    private Diagram diagram;

    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        Layer layer1 = new Layer();

        Shape Circle = new Circle(2,2,170);
        Shape Circle2 = new Circle(1,1,150);
        Shape Rectangle = new Rectangle(100,100,200,100,50,50,100,50);
        Shape Square = new Square(100,100,0,0,0,100,100,0);
        Shape Triangle = new Triangle(100,100,200,200,200,300);
        Shape Triangle2 = new Triangle(150,200,150,100,200,300);

        layer.setName("test");
        layer.setVisible(false);
        layer1.setName("test1");
        layer1.setVisible(true);
        layer.addCircle(Circle2);
        layer.addRectangle(Rectangle);
        layer1.addTriangle(Triangle);
        layer1.addTriangle(Triangle2);
        layer1.addSquare(Square);
        layer1.addSquare(Square);
        diagram.setLayer(layer);
        diagram.setLayer(layer1);
        diagram.getLayer(1).deleteSameShape();

        diagram.drawAllLayer();
    }

}
