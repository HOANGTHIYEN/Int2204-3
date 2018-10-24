import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Diagram {
    protected List<Layer> listLayer;
    JFrame jFrame;

    public Diagram() {
        listLayer = new ArrayList<>();
    }

    public void addLayer(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle() {
        for (int i = 0; i < listLayer.size(); i++) {

            this.listLayer.get(i).removeAllCircle();
        }
    }
    public void addShape(Layer layer) {
        listLayer.add(layer);
    }
    public void printAll() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());
        for (Layer layer : listLayer) {
            for (Shape shape : layer.listShape) {
                if (shape.validate()) {
                    Graphics draw = new Graphics(shape);
                    jFrame.add(draw);
                } else {
                    System.out.println(shape.toString() + " sai");
                }
            }
        }
        jFrame.pack();
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        Square  square = new Square(new Position[]{
                new Position(0,0),
                new Position(450,50),
                new Position(450,450),
                new Position(0,40)
        }, Color.BLUE, false);

        Layer layer = new Layer();
        Rectangle rectangle = new Rectangle(new Position[]{
                new Position(0,0),
                new Position(250,0),
                new Position(200,150),
                new Position(0,100)
        }, Color.BLUE, false);
        Triangle triangle = new Triangle(
                new Position[]{
                        new Position(300,0),
                        new Position(600,600),
                        new Position(0,600),
                }, Color.RED, false
        );
        layer.addShape(rectangle);
        layer.addShape(square);
        layer.addShape(triangle);
        Diagram diagram = new Diagram();
        diagram.addShape(layer);
        diagram.printAll();
    }
    }

    class Position {
        public int posX;
        public int posY;

        public Position(int posX, int posY) {
            this.posX = posX;
            this.posY = posY;
        }
    }

    class Diem {
        public double toaDo_x;
        public double toaDo_y;

        public Diem() {
            toaDo_x = 1.0;
            toaDo_y = 1.0;
        }

        public Diem(double x, double y) {
            toaDo_x = x;
            toaDo_y = y;
        }

    }

    class Layer extends Diagram {
        //protected String name;
        protected List<Shape> listShape;
        protected boolean visible;

        public Layer() {
            this.listShape = new ArrayList<>();
            //this.name = name;
        }

        public void addShape(Shape shape) {
            this.listShape.add(shape);
        }

        public void removeAllTriangle() {
            for (int i = 0; i < listShape.size(); i++) {
                if (listShape.get(i) instanceof Triangle) {
                    listShape.remove(i);
                    i--;
                }
            }
        }

        public void removeAll(boolean visible) {
            if (visible == false) {
                for (int i = 0; i < listShape.size(); i++) {
                    if (listShape.get(i) instanceof Shape) {
                        listShape.remove(i);
                        i--;
                    }
                }
            }

        }

        public void removeAllCircle() {
            for (int i = 0; i < listShape.size(); i++) {
                if (listShape.get(i) instanceof Circle) {
                    listShape.remove(i);
                    i--;
                }
            }
        }

        public void showAllShapes() {
            System.out.println(this);
            for (Shape shape : this.listShape) {
                System.out.println(shape);
            }
        }

        public void removeSameLayer() {
            for (int i = 0; i < listShape.size(); i++) {
                for (int j = i + 1; j < listShape.size(); j++) {
                    if (listShape.get(i) == listShape.get(j)) System.out.println("hehe");
                }
            }
        }

        public String toString() {
            return "Layer: ";
        }
    }

    abstract class Shape {
        protected Color color;

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        protected boolean filled;

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        protected boolean diChuyen;

        public boolean getDiChuyen() {
            return diChuyen;
        }

        public void setDiChuyen(boolean diChuyen) {
            this.diChuyen = diChuyen;
        }

        public Position[] pos;

        public Shape(Position[] pos, Color color, boolean diChuyen) {
            this.color = color;
            this.diChuyen = diChuyen;
            this.pos = pos;
        }

        public void move(int length, int huong) {
            switch (huong) {
                case 1: {
                    for (Position position : pos) {
                        position.posY = (position.posY - length);
                    }
                    break;
                }
                case 2: {
                    for (Position position : pos) {
                        position.posY = (position.posY + length);
                    }
                    break;
                }
                case 3: {
                    for (Position position : pos) {
                        position.posX = (position.posX - length);
                    }
                    break;
                }
                case 4: {
                    for (Position position : pos) {
                        position.posX = (position.posX + length);
                    }
                    break;
                }
            }
        }

        public Shape() {
            diChuyen = true;
            filled = true;
        }

        public Shape(boolean dc, Color ms, boolean f) {

            diChuyen = dc;
            color = ms;
            filled = f;
        }

        public abstract boolean validate();

        public String toString() {
            return "Shape:\n  "
                    + "\n   Di Chuyen: " + diChuyen + "\n   Color: " + color + "\n   Filled: " + filled + "\n";
        }
    }

    class Rectangle extends Shape {

        protected Diem A;
        protected Diem B;
        protected Diem C;
        protected Diem D;

        public double getWidth() {
            return Math.sqrt((A.toaDo_x - D.toaDo_x) * (A.toaDo_x - D.toaDo_x) + (A.toaDo_y - D.toaDo_y) * (A.toaDo_y - D.toaDo_y));
        }

        public double getLength() {
            return Math.sqrt((A.toaDo_x - B.toaDo_x) * (A.toaDo_x - B.toaDo_x) + (A.toaDo_y - B.toaDo_y) * (A.toaDo_y - B.toaDo_y));
        }

        public Rectangle(Position[] pos, Color color, boolean canMove) {
            super(pos, color, canMove);
        }

        public Rectangle() {
            A = new Diem(0.0, 1.0);
            B = new Diem(2.0, 1.0);
            C = new Diem(2.0, 0.0);
            D = new Diem(0.0, 0.0);
        }

        public Rectangle(boolean dc, Color ms, boolean f, Diem x, Diem y, Diem z, Diem t) {
            super(dc, ms, f);

            A = x;
            B = y;
            C = z;
            D = t;
        }

        public double getArea() {
            return getWidth() * getLength();
        }

        public double getPerimeter() {
            return 2 * (getWidth() + getLength());
        }

        public boolean checkRectangle(Rectangle h1, Rectangle h2) {
            //if(h1.A == h2.A || h1.A == h2.B || h1.A == h2.C || h1.A == h2.D)
            if (h1 == h2) return true;
            else return false;
        }

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

        public String toString() {
            return "Rectangle:\n    Di Chuyen: "
                    + diChuyen + "\n   Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Width: "
                    + getWidth() + "\n   Length: " + getLength() + "\n   Area: " + getArea()
                    + "\n   Perimeter: " + getPerimeter() + "\n";
        }
    }
class Hexagon extends Shape{
    protected Diem x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6;
    public boolean validate()
    {
        return false;
    }
}
    class Square extends Rectangle {


        public double getSide() {
            return Math.sqrt((A.toaDo_x - B.toaDo_x) * (A.toaDo_x - B.toaDo_x) + (A.toaDo_y - B.toaDo_y) * (A.toaDo_y - B.toaDo_y));

        }

        public Square(Position[] pos, Color color, boolean canMove) {
            super(pos, color, canMove);
        }

        public Square(boolean dc, Color ms, boolean f, Diem x, Diem y, Diem z, Diem t) {
            super(dc, ms, f, x, y, z, t);
        }

        public boolean checkSquare(Square h1, Square h2) {
            if (h1 == h2) return true;
            else return false;
        }

        public boolean validate() {
            if (pos.length < 4) return false;
            double x1 = pos[0].posX, y1 = pos[0].posY;
            double x2 = pos[1].posX, y2 = pos[1].posY;
            double x3 = pos[2].posX, y3 = pos[2].posY;
            double dx12 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double dx23 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

            super.validate();
            return dx12 == dx23;
        }

        public String toString() {
            return "Square:\n     Di Chuyen: " +
                    diChuyen + "\n   Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Width: " + getWidth() +
                    "\n   Length: " + getLength() + "\n   Area: " + getArea() + "\n   Perimeter: " + getPerimeter() + "\n";
        }
    }

    class Circle extends Shape {
        protected double radius;
        Diem I;
        public final float PI = (float) Math.PI;

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

        public Circle() {
            radius = 1.0;
            I = new Diem(0.0, 0.0);
        }

        public Circle(double bk, Diem x) {
            radius = bk;
            I = x;
        }

        public Circle(boolean dc, Color ms, boolean f, double bk, Diem x) {
            super(dc, ms, f);
            radius = bk;
            I = x;
        }

        public double getArea() {
            double area = PI * radius * radius;
            return area;
        }

        public double getPerimeter() {
            double perimeter = 2 * PI * radius;
            return perimeter;
        }

        public boolean checkCircle(Circle h1, Circle h2) {
            //if(h1.A == h2.A || h1.A == h2.B || h1.A == h2.C || h1.A == h2.D)
            if (h1 == h2) return true;
            else return false;
        }

        public boolean validate() {
            return false;
        }

        public String toString() {
            return "Circle:\n   Di Chuyen: " + diChuyen +
                    "\n   Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Radius: " + radius
                    + "\n   Area: " + getArea() + "\n   Perimeter: " + getPerimeter() + "\n";
        }

    }

    class Triangle extends Shape {
        Diem A;
        Diem B;
        Diem C;

        public double getAB() {
            return Math.sqrt((A.toaDo_x - B.toaDo_x) * (A.toaDo_x - B.toaDo_x) + (A.toaDo_y - B.toaDo_y) * (A.toaDo_y - B.toaDo_y));
        }

        public double getAC() {
            return Math.sqrt((A.toaDo_x - C.toaDo_x) * (A.toaDo_x - C.toaDo_x) + (A.toaDo_y - C.toaDo_y) * (A.toaDo_y - C.toaDo_y));
        }

        public double getBC() {
            return Math.sqrt((B.toaDo_x - C.toaDo_x) * (B.toaDo_x - C.toaDo_x) + (B.toaDo_y - C.toaDo_y) * (B.toaDo_y - C.toaDo_y));
        }

        public Triangle(Position[] pos, Color color, boolean canMove) {
            super(pos, color, canMove);
        }

        public Triangle(Diem x, Diem y, Diem z) {
            A = x;
            B = y;
            C = z;
        }

        public Triangle(boolean dc, Color ms, boolean f, Diem x, Diem y, Diem z) {
            super(dc, ms, f);
            A = x;
            B = y;
            C = z;
        }

        public double getArea() {
            double p = (getAB() + getAC() + getBC()) / 2;
            return Math.sqrt(p * (p - getAB()) * (p - getAC()) * (p - getBC()));
        }

        public double getPerimeter() {
            return (getAB() + getAC() + getBC());
        }

        public boolean checkTriangle(Triangle h1, Triangle h2) {
            //if(h1.A == h2.A || h1.A == h2.B || h1.A == h2.C || h1.A == h2.D)
            if (h1 == h2) return true;
            else return false;
        }

        public boolean validate() {
            if (pos.length < 3) return false;
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
            return "Triangle:\n     Di Chuyen: " + diChuyen + "\n   Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Side1: "
                    + getAB() + "\n   Side2: " + getAC() + "\n   Side3: " + getBC() + "\n   Area: " + getArea()
                    + "\n   Perimeter: " + getPerimeter() + "\n";
        }
    }



