package com.company;

public class Main {

    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer = new Layer();

        Shape Circle = new Circle(0,0,1);
        Shape Circle2 = new Circle(1,0,1);
        Shape Rectangle = new Rectangle(0,0,0,2,3,2,3,0);
        Shape Square = new Square(0,0,0,1, 1,1,1,0);
        Shape Triangle = new Triangle(0,0,1,1,2,3);
        Shape Triangle2 = new Triangle(0,0,1,1,2,3);

        layer.setName("test");
        layer.drawCircle(Circle);
        layer.drawRectangle(Rectangle);
        layer.drawSquare(Square);
        layer.drawTriangle(Triangle);
        layer.drawTriangle(Triangle2);
        layer.drawCircle(Circle2);

        diagram.setLayer(layer);
        Layer layer2 = diagram.getLayer(layer.getIndex());
        System.out.println(layer2.getName());

        if(layer2.deleteAllTriangle()){
            System.out.println("Delete Triangle success");
        }

        if(diagram.deleteAllCircleInDiagram()){
            System.out.println("Delete Circle in diagram success");
        }
    }
}
