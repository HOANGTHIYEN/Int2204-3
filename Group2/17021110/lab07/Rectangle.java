public class Rectangle extends Shape{
    private Point pointA = new Point(0,0);
    private double width = 1, height = 1;
    private Point pointB,pointC,pointD;

    /**
     * compare two Rectangle
     * @param otherRec
     * @return true if they are duplicated
     */
    public boolean compareRectangle(Rectangle otherRec) {
        return (this.pointA.pointEquals(otherRec.pointA)
                && (this.width == otherRec.width)
                && (this.height==otherRec.height));
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

    public Point getPointC() {
        return pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String color, Point pointA, double width, double height) {
        super(color);
        this.pointA = pointA;
        this.width = width;
        this.height = height;

        pointB = new Point(pointA.getX() + width,pointA.getY());
        pointC = new Point(pointA.getX(),pointA.getY() + height);
        pointD = new Point(pointA.getX() + width,pointA.getY() + height);
    }

    @Override
    protected boolean isExist() {
        if ( (this.width<=0 ) || (this.height<=0) )
            exist = false;
        return exist;
    }

    @Override
    public double sizeCal() {
        return (width * height);
    }

    @Override
    public void erase() {
        if (isExist()) {
            System.out.println(String.format(
                    "Remove rectangle with 4 points: %s, %s, %s, %s and color: %s",
                    pointA.pointDraw(),pointB.pointDraw(),
                    pointC.pointDraw(),pointD.pointDraw(),getColor()));
        }
        else {
            System.out.println("Not exist to remove");
        }
    }

    @Override
    public void location() {
        if (isExist()) {
            System.out.println(String.format(
                    "Rectangle with 4 points: %s, %s, %s, %s and color: %s",
                    pointA.pointDraw(),pointB.pointDraw(),
                    pointC.pointDraw(),pointD.pointDraw(),getColor()));
        }
        else {
            System.out.println("Not exist");
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

        pointD.setX(pointD.getX() - vectorMove.getX());
        pointD.setY(pointD.getY() - vectorMove.getY());
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

}
