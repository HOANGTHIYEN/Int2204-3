package bai2;

public class Rectangle extends shape {
    public double width;
    public double length;
    // constructor
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // getter & setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    // lay dien tich
    public double getArea() {
        return length*width;
    }
    // lay chu vi
    public double getPerimeter() {
        return 2*(length + width);
    }

    // the hien ra
    @Override
    public String toString() {
        return ( "Hinh chu nhat co chieu dai " + getLength()
                + ", chieu rong la " + getWidth() + ", dien tich la " +
                getArea() + ", chu vi la " + getPerimeter()
                + "\n" + super.toString() );
    }

}
