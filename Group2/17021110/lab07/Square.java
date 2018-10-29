public class Square extends Rectangle {
    private double length = 1;

    public Square(String color, Point pointA, double length) {
        super(color, pointA, length, length);
        this.length = length;
    }
}
