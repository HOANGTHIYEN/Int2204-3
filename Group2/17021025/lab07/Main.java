import java.awt.Shape;

public class Main {
    static public void main (String[] args) {
        Point pA = new Point(0,0);
        Triangle newTri = new Triangle("Red");
        Square newSquare = new Square("Green",pA,3);
        Square newSquare2 = new Square("Green",pA,3);

        Layer layer = new Layer();
        layer.addShape(newSquare);
        layer.addShape(newTri);
        layer.addShape(newSquare2);

        Diagram diagram = new Diagram();
        diagram.addLayer(layer);

        diagram.layerClassify();
        diagram.getLayerList().get(3).printShapeList();
    }
}