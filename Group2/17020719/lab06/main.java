public class main {
    public static void main(String[] args) {

        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        layer.setName("lab06");

        Shape Circle1 = new Circle();
        System.out.println(Circle1);
        layer.drawCircle(Circle1);

        Shape Circle2 = new Circle(2.0);
        System.out.println(Circle2);
        layer.drawCircle(Circle2);

        Shape Rectangle = new Rectangle();
        System.out.println(Rectangle);
        layer.drawRectangle(Rectangle);

        Shape Square = new Square();
        System.out.println(Square);
        layer.drawSquare(Square);

        Shape Triangle1 = new Triangle();
        System.out.println(Triangle1);
        layer.drawTriangle(Triangle1);

        Shape Triangle2 = new Triangle();
        System.out.println(Triangle2);
        layer.drawTriangle(Triangle2);

        diagram.setLayer(layer);
        Layer layer2 = diagram.getLayer(layer.getIndex());
        if(layer2.deleteAllTriangle()){
            System.out.println("success");
        }
        diagram.deleteAllCircleInDiagram();
    }

}

