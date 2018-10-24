/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram123;

import java.util.ArrayList;

/**
 *
 * @author Xuan Dung
 */
public class Diagram {

    public ArrayList<Layer> layer;

    public Diagram() {
        layer = new ArrayList<>();
    }

    public void del_Circle() {
        for (Layer l : layer) {
            for (int i = 0; i < l.shape.size(); i++) {
                if (l.shape.get(i) instanceof Circle) {
                    l.shape.remove(i);
                }
            }
        }
    }

    public void print() {
        for (Layer l : layer) {
            for (int i = 0; i < l.shape.size(); i++) {
                l.shape.get(i).show(true);
            }
        }
    }

    public void moveToLayerOwn_and_print() {
        Layer layerCircle = new Layer();
        Layer layerRectangle = new Layer();
        Layer layerSquare = new Layer();
        Layer layerTriangle = new Layer();
        Layer layerOther = new Layer();
        for (Layer l : layer) {

            for (int i = 0; i < l.shape.size(); i++) {
                if (l.shape.get(i) instanceof Circle) {
                    layerCircle.shape.add(l.shape.get(i));
                } else if (l.shape.get(i) instanceof Rectangle) {
                    layerRectangle.shape.add(l.shape.get(i));
                } else if (l.shape.get(i) instanceof Square) {
                    layerSquare.shape.add(l.shape.get(i));
                } else if (l.shape.get(i) instanceof Triangle) {
                    layerTriangle.shape.add(l.shape.get(i));
                } else {
                    layerOther.shape.add(l.shape.get(i));
                }

            }

        }
        System.out.println("Layer for Circle!");
        for(int i=0;i<layerCircle.shape.size();i++){
            layerCircle.shape.get(i).show(true);
        }
        System.out.println("\n Layer for Rectangle!");
        for(int i=0;i<layerRectangle.shape.size();i++){
            layerRectangle.shape.get(i).show(true);
        }
        System.out.println("\n Layer for Square!");
        for(int i=0;i<layerSquare.shape.size();i++){
            layerSquare.shape.get(i).show(true);
        }
        System.out.println("\n Layer for Triangle!");
        for(int i=0;i<layerTriangle.shape.size();i++){
            layerTriangle.shape.get(i).show(true);
        }
        System.out.println("\n Layer for Other!");
        for(int i=0;i<layerOther.shape.size();i++){
            layerOther.shape.get(i).show(true);
        }       
    }

    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();

        Shape circle1 = new Circle(2, "Red");
        circle1.setLocation(1, 1);

        Shape square1 = new Square(3, "Blue");
        square1.setLocation(2, 2);

        Shape rectangle1 = new Rectangle(3, 2, "Red");
        rectangle1.setLocation(5, 5);

        Shape triangle1 = new Triangle("nhọn", "Black");
        triangle1.setLocation(3, 3);

        Shape circle2 = new Circle(2, "Red");
        circle2.setLocation(5, 1);

        Shape square2 = new Square(3, "Blue");
        square2.setLocation(2, 2);

        layer1.shape.add(circle1);
        layer1.shape.add(square1);
        layer1.shape.add(triangle1);
        layer1.shape.add(rectangle1);
        layer1.shape.add(square2);
        layer1.shape.add(circle2);
        diagram.layer.add(layer1);
        System.out.println("In ra số hình đầu tiên!");
        diagram.print();
        System.out.println("\n\n");
        //diagram.del_Circle();
        //diagram.print();

        System.out.println("In ra số hình sau khi đã xóa tam giác Triangle!");
        layer1.del_Triangle();
        diagram.print();
        System.out.println("\n\n");

        System.out.println("Sử dụng phương thức xóa những hình trùng nhau cộng với phương thức visible!");
        boolean drawing = true;
        //layer1.SetVisible(drawing);
        layer1.del_equals();
        layer1.SetVisible(drawing);
        
        System.out.println("\n\n Thêm hình lục giác Hexagon: ");
        Shape hexagon1 = new Hexagon(3, "Green");
        hexagon1.setLocation(15, 15);
        layer1.shape.add(hexagon1);
        layer1.SetVisible(drawing);
        
        System.out.println("\n\n Sử dụng phương thức chuyển các loại hình vẽ về layer của riêng nó!");
        diagram.moveToLayerOwn_and_print();

    }

}
