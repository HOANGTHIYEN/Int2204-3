import java.util.ArrayList;
import java.util.List;

public class Diagram {
    protected List<Layer> listLayer;

    public Diagram() {
        listLayer = new ArrayList<>();
    }

    public void addLayer(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeCircle() {
        for (int i = 0; i < listLayer.size(); i++) {
            this.listLayer.get(i).removeCircle();
        }
    }

    public void showLayer() {
        for (Layer layer : listLayer) {
            layer.showShapes();
        }
    }
}
class Layer extends Diagram {
    private String name;
    private List<Shape> listShape;


    public Layer(String name) {
        listShape = new ArrayList<>();
        this.name = name;
    }

    public void addShape(Shape shape) {
        listShape.add(shape);
    }

    public void removeTriangle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
                i--;
            }

        }
    }

    public void removeCircle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle) {
                listShape.remove(i);
                i--;
            }
        }
    }

    public void showShapes() {
        System.out.println(this);
        for (Shape shape : listShape) {
            System.out.println(shape);
        }
    }

    @Override
    public String toString() {
        return "Layer: " + name;
    }
}
abstract class Shape {
    protected double x;
    protected double y;
    protected String color;


    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape() {
        x = 0;
        y = 0;
        color = "white";
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void fillColor(String color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
class Retangle extends Shape {

    protected double width;
    protected double length;


    public Retangle() {
        super();
        length = 1.0;
        width = 1.0;
    }

    public Retangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Retangle(int x, int y, String color, double width, double length) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
class Square extends Retangle {


    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(int x, int y, String color, double side) {
        super(x, y, color, side, side);
    }



    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public void setLength(double side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
class Circle extends Shape {
    public final double PI = 3.14;
    private double radius;


    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} ";
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    //constructor

    public Triangle() {
        super();
        base = 1.0;
        height = 1.0;
    }

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public Triangle(double x, double y, String color, double base, double height) {
        super(x, y, color);
        this.base = base;
        this.height = height;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.base * this.height * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}


