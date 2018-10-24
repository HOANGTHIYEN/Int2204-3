package lap07;


import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
class Layer extends JPanel {
    private ArrayList <Shape> figure = new ArrayList<Shape>();
    private boolean visible = true;
    public Layer() {

    }

    public int getElementsSize() {
        return figure.size();
    }
    public void addShape(Shape shape) {
        figure.add(shape);
    }
    public void clearAllTriangle() {
        ArrayList <Shape> tri = new ArrayList<Shape>();
        for (Shape shape: figure) {
            if (shape instanceof Triangle) tri.add(shape);
        }
        figure.removeAll(tri);
    }
    public void clearAllSquare() {
        ArrayList <Shape> s = new ArrayList<Shape>();
        for (Shape shape: figure) {
            if (shape instanceof Square) s.add(shape);
        }
        figure.removeAll(s);
    }

    public void clearAllRect() {
        ArrayList <Shape> r = new ArrayList<Shape>();
        for (Shape shape: figure) {
            if (shape instanceof Rectangle) r.add(shape);
        }
        figure.removeAll(r);
    }

    public void clearAllCircle() {
        ArrayList <Shape> c = new ArrayList<Shape>();
        for (Shape shape: figure) {
            if (shape instanceof Circle) c.add(shape);
        }
        figure.removeAll(c);
    }

    public void clearAllHexagon() {
        ArrayList <Shape> h = new ArrayList<Shape>();
        for (Shape shape: figure) {
            if (shape instanceof Hexagon) h.add(shape);
        }
        figure.removeAll(h);
    }

    public void clearAllMatch() {
        ArrayList<Shape> h = new ArrayList<Shape>();
        for (int i=0;i<figure.size();i++) {
            for (int j=i+1;j<figure.size();j++) {
                if (figure.get(i) instanceof Circle) {
                    if (((Circle)figure.get(i)).equals(figure.get(j)))
                        h.add(figure.get(j));
                }
                if (figure.get(i) instanceof Rectangle) {
                    if (((Rectangle)figure.get(i)).equals(figure.get(j)))
                        h.add(figure.get(j));
                }
                if (figure.get(i) instanceof Hexagon) {
                    if (((Hexagon)figure.get(i)).equals(figure.get(j)))
                        h.add(figure.get(j));
                }
                if (figure.get(i) instanceof Triangle) {
                    if (((Triangle)figure.get(i)).equals(figure.get(j)))
                        h.add(figure.get(j));
                }
            }
        }
        figure.removeAll(h);
    }

    public void showAllShape() {
        int i=0;
        for (Shape shape: figure) {
            System.out.println("Hinh thu " +i+" : ");
            shape.getInfo();
            i++;
        }
    }

    public void removeShape(int shapeNo) {
        figure.remove(shapeNo);
    }

    public Shape getShape(int shapeNo) {
        return figure.get(shapeNo);
    }

    public void setVisible(boolean visible) {
        this.visible=visible;
    }

    public boolean isVisible() {
        return visible;
    }
    //vẽ Shape
    public void drawShape(Graphics g) {
        for (Shape shape: figure) {
            int pX = shape.getX();
            int pY = shape.getY();
            if (shape instanceof Rectangle) {
                int w  = ((Rectangle) shape).getWidth();
                int l  = ((Rectangle) shape).getLength();
                g.setColor(shape.getColor());
                g.drawRect(pX, pY, w, l);
            }
            if (shape instanceof Square) {
                int s  = ((Square) shape).getWidth();
                g.setColor(shape.getColor());
                g.drawRect(pX, pY, s, s);
            }
            if (shape instanceof Circle) {
                int s = ((Circle) shape).getRadius();
                g.setColor(shape.getColor());
                g.drawOval(pX, pY, s, s);
            }
            if (shape instanceof Triangle) {
                int[] X= {((Triangle)shape).node1.getX(),
                        ((Triangle)shape).node2.getX(),
                        ((Triangle)shape).node3.getX()
                };
                int[] Y= {((Triangle)shape).node1.getY(),
                        ((Triangle)shape).node2.getY(),
                        ((Triangle)shape).node3.getY()
                };
                g.setColor(shape.getColor());
                g.drawPolygon(X, Y, 3);
            }
            if (shape instanceof Hexagon) {
                int[] X= {((Hexagon)shape).node1.getX(),
                        ((Hexagon)shape).node2.getX(),
                        ((Hexagon)shape).node3.getX(),
                        ((Hexagon)shape).node4.getX(),
                        ((Hexagon)shape).node5.getX(),
                        ((Hexagon)shape).node6.getX()
                };
                int[] Y= {((Hexagon)shape).node1.getY(),
                        ((Hexagon)shape).node2.getY(),
                        ((Hexagon)shape).node3.getY(),
                        ((Hexagon)shape).node4.getY(),
                        ((Hexagon)shape).node5.getY(),
                        ((Hexagon)shape).node6.getY()
                };
                g.setColor(shape.getColor());
                g.drawPolygon(X, Y, 6);
            }
        }
    }
}