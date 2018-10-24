package lap07;

import java.awt.*;


class Triangle extends Shape {
    protected Location
            node1= new Location(0,0),
            node2 = new Location(0,1),
            node3= new Location(1,2);

    public Triangle() {
        super();
    }

    public Triangle(int X, int Y, Color color, boolean isFilled) {
        super(X, Y, color, isFilled);
        node1.setPos(X, Y);
    }

    public Triangle(Location node1, Location node2, Location node3) {
        super();
        this.node1= node1;
        this.node2= node2;
        this.node3= node3;
    }

    public Triangle(int X, int Y, Color color, boolean isFilled, Location node2, Location node3) {
        super(X, Y, color, isFilled);
        node1.setPos(X, Y);
        this.node2= node2;
        this.node3= node3;
    }

    public void resize(Location node1, Location node2, Location node3, Location node4, Location node5, Location node6) {
        this.node1= node1;
        this.node2= node2;
        this.node3= node3;
    }
    @Override
    public void getInfo() {
        System.out.println("Triangle");
        System.out.println("Location: ");
        System.out.println(node1.getX() + "," + node1.getY());
        System.out.println(node2.getX() + "," + node2.getY());
        System.out.println(node3.getX() + "," + node3.getY());
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
    }

    @Override
    public boolean equals(Shape shape) {
        if (shape instanceof Triangle) {
            if (shape.X!=this.X || shape.Y!=this.Y)
                return false;
            if (((Triangle)shape).node2.getX()!=this.node2.getX() || ((Triangle)shape).node2.getY()!=this.node2.getY())
                return false;
            if (((Triangle)shape).node3.getX()!=this.node3.getX() || ((Triangle)shape).node3.getY()!=this.node3.getY())
                return false;
            return true;
        }
        return false;
    }

}