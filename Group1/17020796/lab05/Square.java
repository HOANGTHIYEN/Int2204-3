package bai2;

public class Square extends Rectangle {
    // constructor
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    // getter & setter
    public double getSide() {
        return super.getWidth();
    }

    public void setSize(double side) {
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        if (super.isFilled()) {
            return ( "Hinh vuong co canh dai " + getSide() + ", dien tich la "
                    + super.getArea() + ", chu vi la " + super.getPerimeter()
                    + "\n" + "Hinh co mau " + super.getColor() + " duoc lap day");
        }
        else
            return ( "Hinh vuong co canh dai " + getSide() + ", dien tich la "
                    + super.getArea() + ", chu vi la " + super.getPerimeter()
                    + "\n" + "Hinh co mau " + super.getColor() + ", khong duoc lap day");

    }

}
