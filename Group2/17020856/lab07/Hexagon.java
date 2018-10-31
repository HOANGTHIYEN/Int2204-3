package lap07;

import java.awt.*;

public class Hexagon  extends Shape{
    protected Location
            node1= new Location(0,0),
            node2 = new Location(0,1),
            node3= new Location(1,0),
            node4= new Location(1,1),
            node5= new Location(2,1),
            node6= new Location(1,0);

    public Hexagon() {
        super();
    }

    public Hexagon(int X, int Y, Color color, boolean isFilled) {
        super(X, Y, color, isFilled);
        node1.setPos(X, Y);
    }

    public Hexagon(Location node1, Location node2, Location node3, Location node4, Location node5, Location node6) {
        super();
        this.node1= node1;
        this.node2= node2;
        this.node3= node3;
        this.node4= node4;
        this.node5= node5;
        this.node6= node6;
    }

    public Hexagon(int X, int Y, Color color, boolean isFilled,Location node2, Location node3, Location node4, Location node5, Location node6) {
        super(X, Y, color, isFilled);
        node1.setPos(X, Y);
        this.node2= node2;
        this.node3= node3;
        this.node4= node4;
        this.node5= node5;
        this.node6= node6;
    }

    public void resize(Location node1, Location node2, Location node3, Location node4, Location node5, Location node6) {
        this.node1= node1;
        this.node2= node2;
        this.node3= node3;
        this.node4= node4;
        this.node5= node5;
        this.node6= node6;
    }
    @Override
    public void getInfo() {
        System.out.println("Hexagon");
        System.out.println("Location: ");
        System.out.println(node1.getX() + "," + node1.getY());
        System.out.println(node2.getX() + "," + node2.getY());
        System.out.println(node3.getX() + "," + node3.getY());
        System.out.println(node4.getX() + "," + node4.getY());
        System.out.println(node5.getX() + "," + node5.getY());
        System.out.println(node6.getX() + "," + node6.getY());
        System.out.println("Color" + color);
        getPos();

    }

    @Override
    public void setPos(int x, int y) {
        this.node1.setPos(x, y);
    }

    @Override
    public void remove(int x, int y) {
        node1.setPos(node1.getX()+x, node1.getY()+y);
        node2.setPos(node2.getX()+x, node2.getY()+y);
        node3.setPos(node3.getX()+x, node3.getY()+y);
        node4.setPos(node4.getX()+x, node4.getY()+y);
        node5.setPos(node5.getX()+x, node5.getY()+y);
        node6.setPos(node6.getX()+x, node6.getY()+y);
    }

    @Override
    public boolean equals(Shape shape) {
        if (shape instanceof Hexagon) {
            if (shape.X!=this.X
                    || shape.Y!=this.Y)
                return false;
            if (((Hexagon)shape).node2.getX()!=this.node2.getX()
                    || ((Hexagon)shape).node2.getY()!=this.node2.getY())
                return false;
            if (((Hexagon)shape).node3.getX()!=this.node3.getX()
                    || ((Hexagon)shape).node3.getY()!=this.node3.getY())
                return false;
            if (((Hexagon)shape).node4.getX()!=this.node4.getX()
                    || ((Hexagon)shape).node4.getY()!=this.node4.getY())
                return false;
            if (((Hexagon)shape).node5.getX()!=this.node5.getX()
                    || ((Hexagon)shape).node5.getY()!=this.node5.getY())
                return false;
            if (((Hexagon)shape).node6.getX()!=this.node6.getX()
                    || ((Hexagon)shape).node6.getY()!=this.node6.getY())
                return false;
            return true;
        }
        return false;
    }
}