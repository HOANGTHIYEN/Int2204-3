public class Triangle extends Shape{
    private Point pointA = new Point(0,0),
            pointB = new Point(0,1),
            pointC = new Point(1,0);

    /**
     * triangle comparator
     * @param otherTri
     * @return true if they are duplicated
     */
    public boolean compareTriangle(Triangle otherTri) {
        return (this.pointA.pointEquals(otherTri.pointA) &&
                this.pointB.pointEquals(otherTri.pointB) &&
                this.pointC.pointEquals(otherTri.pointC));
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Triangle(String color) {
        super(color);
    }

    public Triangle(String color, Point pointA, Point pointB, Point pointC) {
        super(color);
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    protected boolean isExist() {
        Point pointAB = new Point(pointB.getX() - pointA.getX(), pointB.getY() - pointA.getY());
        Point pointCB = new Point(pointB.getX() - pointC.getX(), pointB.getY() - pointC.getY());
        if (pointAB.getX() * pointCB.getY() == pointAB.getY() * pointCB.getX() || !exist)
            return false;
        else
            return true;
    }

    @Override
    public double sizeCal() {
        if (isExist()) {
            double lengthAB = Point.linearCal(pointA,pointB)
                    ,lengthBC = Point.linearCal(pointB,pointC)
                    ,lengthCA = Point.linearCal(pointA,pointC);
            double halfPerimeter = lengthAB + lengthBC + lengthCA;
            return Math.sqrt(
                    halfPerimeter * (halfPerimeter - lengthAB) * (halfPerimeter - lengthBC) * (halfPerimeter - lengthCA));
        }
        else
            return -1;
    }

    @Override
    public void location() {
        if (isExist()){
            System.out.println(String.format(
                    "Triangle with 3 points at: %s, %s, %s, Color %s"
                    ,pointA.pointDraw(),pointB.pointDraw(),pointC.pointDraw(),getColor()));
        }
        else {
            System.out.println("Can not define Triangle");
        }

    }

    @Override
    public void move(Point vectorMove) {
        pointA.setX(pointA.getX() - vectorMove.getX());
        pointA.setY(pointA.getY() - vectorMove.getY());

        pointB.setX(pointB.getX() - vectorMove.getX());
        pointB.setY(pointB.getY() - vectorMove.getY());

        pointC.setX(pointC.getX() - vectorMove.getX());
        pointC.setY(pointC.getY() - vectorMove.getY());
    }

    @Override
    public void erase() {
        if (isExist()) {
            System.out.println(String.format("Remove triangle with 3 points at: %s, %s, %s",
                    pointA.pointDraw(),pointB.pointDraw(),pointC.pointDraw()));
        }
        else {
            System.out.println("Can not define Triangle");
        }
    }
}