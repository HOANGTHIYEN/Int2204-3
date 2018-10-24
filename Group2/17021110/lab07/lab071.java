

import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
class Position {
    public   int posX;
    public  int posY;

    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
}
 abstract class Shape {
    public Position[] pos;
    protected Color color;
    protected boolean canMove;

    public Shape(Position[] pos, Color color, boolean canMove) {
        this.color = color;
        this.canMove = canMove;
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int length, int huong){
        switch ( huong){
            case 1 :{
                for(Position position: pos){
                    position.posY = (position.posY - length);
                }
                break;
            }
            case 2 :{
                for(Position position: pos){
                    position.posY = (position.posY + length);
                }
                break;
            }
            case 3 :{
                for(Position position: pos){
                    position.posX = (position.posX - length);
                }
                break;
            }
            case 4 :{
                for(Position position: pos){
                    position.posX = (position.posX + length);
                }
                break;
            }
        }
    }

    public abstract boolean validate();
}
 class Layer extends Diagram {
    public ArrayList<Shape> listShape;

    public Layer() {
        listShape = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        this.listShape.add(shape);
    }

    public void removeAllTriangle(){
        ArrayList<Shape> shapes = (ArrayList<Shape>) listShape.clone();
        for(Shape shape : shapes){
            if(shape instanceof Triangle){
                listShape.remove(shape);
            }
        }
    }
 class Circle extends Shape {
    protected double radius = 1.0;
    protected final double PI = 3.14;

    public Circle(Position[] pos, Color color, boolean canMove, double radius) {
        super(pos, color, canMove);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }

    @Override
    public boolean validate() {
        return false;
    }
}
    public void removeAllCircle(){
        ArrayList<Shape> shapes = (ArrayList<Shape>) listShape.clone();
        for(Shape shape : shapes){
            if(shape instanceof Circle){
                listShape.remove(shape);
            }
        }
    }

    public int sizeOfList(){
        return listShape.size();
    }

    public void printShape(){
        for(Shape shape: listShape){
            System.out.println(shape.toString());
        }
    }
}
 class Diagram {
    JButton removeTriangle = new JButton("Remove Triangle");
    JFrame jFrame;
    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    protected ArrayList<Layer> listLayer;

    public Diagram() {
        listLayer = new ArrayList<>();
        removeTriangle.addActionListener(e -> {
            removeAllTriangle();
            jFrame.hide();
            printAll();
        });
    }

    public void addShape(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle(){
        ArrayList<Layer> layers = (ArrayList<Layer>) listLayer.clone();
        for(Layer layer : layers){
            layer.removeAllCircle();
        }
    }

    public void removeAllTriangle(){
        ArrayList<Layer> layers = (ArrayList<Layer>) listLayer.clone();
        for(Layer layer : layers){
            layer.removeAllTriangle();
        }
    }

    public void printAll() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());
        for(Layer layer: listLayer){
            for(Shape shape: layer.listShape){
                if(shape.validate()){
                    //DrawShape drawShape = new DrawShape(shape);
                    //jFrame.add(drawShape);
                }else {
                    System.out.println(shape.toString() + " invalid");
                }
            }
        }

        jFrame.add(removeTriangle);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}

 class Rectangle extends Shape {

    public Rectangle(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public boolean validate() {
        if (pos.length < 4) return false;
        double x1 = pos[0].posX, y1 = pos[0].posY;
        double x2 = pos[1].posX, y2 = pos[1].posY;
        double x3 = pos[2].posX, y3 = pos[2].posY;
        double x4 = pos[3].posX, y4 = pos[3].posY;
        double cx, cy;
        double dd1, dd2, dd3, dd4;
        cx = (x1 + x2 + x3 + x4) / 4;
        cy = (y1 + y2 + y3 + y4) / 4;

        dd1 = Math.sqrt(Math.abs(cx - x1)) + Math.sqrt(Math.abs(cy - y1));
        dd2 = Math.sqrt(Math.abs(cx - x2)) + Math.sqrt(Math.abs(cy - y2));
        dd3 = Math.sqrt(Math.abs(cx - x3)) + Math.sqrt(Math.abs(cy - y3));
        dd4 = Math.sqrt(Math.abs(cx - x4)) + Math.sqrt(Math.abs(cy - y4));
        return dd1 == dd2 && dd1 == dd3 && dd1 == dd4;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}

class Square extends Rectangle {
    public Square(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public boolean validate() {
        if (pos.length < 4) return false;
        double x1 = pos[0].posX, y1 = pos[0].posY;
        double x2 = pos[1].posX, y2 = pos[1].posY;
        double x3 = pos[2].posX, y3 = pos[2].posY;
        double dx12 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double dx23 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));

        super.validate();
        return dx12 == dx23;
    }

    @Override
    public String toString() {
        return "Square{" +
                "pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
 class Triangle extends Shape {

    public Triangle(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public boolean validate() {
        if(pos.length < 3) return  false;
        Point vertex1 = new Point(pos[0].posX, pos[0].posY);
        Point vertex2 = new Point(pos[1].posX, pos[1].posY);
        Point vertex3 = new Point(pos[2].posX, pos[2].posY);

        double side1 = Math.abs(vertex1.distance(vertex2));
        double side2 = Math.abs(vertex2.distance(vertex3));
        double side3 = Math.abs(vertex3.distance(vertex1));

        boolean valid = side1 + side2 > side3
                && side2 + side3 > side1
                && side3 + side1 > side2;
        return valid;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
class Hexagon extends Shape {
	Point[] s = new Point[6];
	
	
	public Hexagon(Point p1,Point p2,Point p3,Point p4,Point p5,Point p6,String c,boolean f, Point point) {
		super(Position[] pos, Color color, boolean canMove);
		this.s[0] = p1;
		this.s[1] = p2;
		this.s[2] = p3;
		this.s[3] = p4;
		this.s[4] = p5;
		this.s[5] = p6;
	}


	public Point[] getS() {
		return s;
	}
	public void setS(Point[] s) {
		this.s = s;
	}

    @Override
    public boolean validate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	
	
}
public class Lab073 {
    public static void main(String[] args) {
        Square  square = new Square(new Position[]{
                new Position(0,0),
                new Position(200,0),
                new Position(200,200),
                new Position(0,200)
        }, Color.BLUE, false);

        Layer layer = new Layer();
        Rectangle rectangle = new Rectangle(new Position[]{
                new Position(0,0),
                new Position(400,0),
                new Position(400,200),
                new Position(0,200)
        }, Color.BLUE, false);
        Triangle triangle = new Triangle(
                new Position[]{
                        new Position(50,0),
                        new Position(100,100),
                        new Position(0,100),
                }, Color.RED, false
        );
        layer.addShape(rectangle);
        layer.addShape(square);
        layer.addShape(triangle);
//        layer.removeAllTriangle();
        Diagram diagram = new Diagram();
        diagram.addShape(layer);
        diagram.removeAllCircle();
        diagram.printAll();




    }
}






