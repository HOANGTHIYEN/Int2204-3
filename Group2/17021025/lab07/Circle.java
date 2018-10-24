public class Circle extends Shape{
    private double radius = 1;
    private Point center = new Point(0,0);

    @Override
    protected boolean isExist() {
        return exist;
    }

    /**
     * Circle comparator
     * @param otherCir
     * @return true if they are duplicated
     */
    public boolean compareCircle(Circle otherCir) {
        return (this.center.pointEquals(otherCir.center) && this.radius == otherCir.radius);
    }

    /**
     * Center getter
     * @return Center Point
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Center setter
     * @param center
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Radius getter
     * @return Radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Radius setter
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius, Point center) {
        super(color);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void erase() {
        System.out.println(String.format("Delete Circle with radius %.2f, Center at %s, Color %s"
                ,radius,center.pointDraw(),getColor()));
    }

    @Override
    public double sizeCal() {
        return pi * radius * radius;
    }

    @Override
    public void location() {
        System.out.println(String.format(
                "Circle with radius %.2f,size: %.2f, Center at %s, Color %s"
                ,radius,sizeCal(),center.pointDraw(),getColor()));
    }

    @Override
    public void move(Point vectorMove) {
        center.setX(center.getX() - vectorMove.getX());
        center.setY(center.getY() - vectorMove.getY());
    }

}