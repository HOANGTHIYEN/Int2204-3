package Week6;

public class main {

    public static void main(String[] args) {
       
        
        Shape a = new Rectangle(1, 2, 3, 4, "red", true);
       
        Shape b = new Square(1, 3, 4, "red", true);
        Shape c = new Circle (1, 2, 3, "white", true);
        Shape d = new Rectangle(1, 2, 3, 4, "green",  true);
        Shape e = new Triangle(1, 2, 3, 4, 5, "black",  true);
        Layer x = new Layer();
        Diagram dia = new Diagram();
        dia.addLayer(x);
        x.addShape(a);
        x.addShape(b);
        x.addShape(c);
        x.addShape(d);
        x.addShape(e);
        dia.printLayer();
        dia.deleteAllTriangle();
        dia.deleteCircle();
        dia.printLayer();
    }    
}