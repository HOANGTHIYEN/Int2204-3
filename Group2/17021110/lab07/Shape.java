public abstract class Shape {
	private String color;
	protected boolean exist = true;
	abstract protected boolean isExist();

    /**
     * shape comparator
     * @param other
     * @return true if they are duplicated
     */
	public boolean compareShape(Shape other) {
	    boolean res = false;
	    if (this instanceof Circle && other instanceof Circle) {
	        res = ((Circle) this).compareCircle((Circle) other);
        }

        else if (this instanceof Rectangle && other instanceof Rectangle) {
            res = ((Rectangle)this).compareRectangle((Rectangle) other);
        }

        else if (this instanceof Triangle && other instanceof  Triangle) {
            res = ((Triangle)this).compareTriangle((Triangle) other);
        }

        return res;
    }

    final static public double pi = Math.PI;
    /**
     * color getter
     * @return color String
     */
    public String getColor() {
        return color;
    }

    /**
     * set color for the shape
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    Shape(String color) {
        this.color = color;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    abstract protected double sizeCal();
    abstract public void erase();
    abstract public void location();
    abstract public void move(Point vectorMove);
}