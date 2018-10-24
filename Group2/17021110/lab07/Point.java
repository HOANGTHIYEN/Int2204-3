public class Point {
	private double x, y;

    /**
     * x getter
     * @return x location
     */
    public double getX() {
        return x;
    }

    /**
     * x setter
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Y getter
     * @return y location
     */
    public double getY() {
        return y;
    }

    /**
     * y setter
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Point constructor
     * @param _x
     * @param _y
     */
    Point(double _x, double _y) {
		this.x = _x;
		this.y = _y;
	}

    /**
     * Drawing a point
     * @return String which represent the point
     */
	public String pointDraw() {
        return String.format("(%.2f;%.2f)",this.x,this.y);
    }

    /**
     * calculate a linear created by 2 points
     * @param pointA
     * @param pointB
     * @return length of AB
     */
    public static double linearCal(Point pointA, Point pointB) {
	    double xSize = pointA.getX() - pointB.getX();
	    double ySize = pointA.getY() - pointB.getY();

	    return Math.sqrt(xSize*xSize + ySize*ySize);
    }

    /**
     * check if 2 points are duplicated
     * @param other
     * @return boolean
     */
    public boolean pointEquals(Point other) {
        return (this.x == other.getX() && this.y == other.getY());
    }
}