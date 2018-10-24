package lb6;

public class main {
    public static void main(String[] args) {
        Layer layer = new Layer();
        Shape circle = new Circle(4, 7, 8, 1, 1, "green", true, true);
        Shape rectangle = new Rectangle(4, 5, 7, 1, 1, 1, "blue", true, true);
        Shape square = new Square(4, 3, 1, 1, 1,"yeallow", true, true);
        Shape triangle = new Triangle(3, 4, 5, 2, 6,1,1, "red", true, true);
        Shape triangle2 = new Triangle(4, 6, 7, 2, 6,1,2, "blue", true, true);
        Shape square2 = new Square(4, 3, 1, 1, 1,"REDDD", true, true);

        layer.getShapes(triangle);
        layer.getShapes(circle);
        layer.getShapes(triangle2);
        layer.getShapes(rectangle);
        layer.getShapes(circle);
        layer.getShapes(square);
        layer.getShapes(square2);
        System.out.println("Những hình có trong layer: ");
        layer.printfShape();
        layer.triangleDelete();
        layer.circleDelete();
        System.out.println("\nCòn lại sau khi xóa Triangle và Circle: ");
        layer.printfShape();

    }
}
