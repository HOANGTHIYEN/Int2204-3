public class Square extends Rectangle {
    //private double side;
    public Square() {
    }

    public Square(double side) {
        length = side;
        width = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        length = side;
        width = side;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }
    public void setLength(double side) {
        length = side;
        width = side;
    }
    public void setWidth (double side) {
        width = side;
        length = side;
    }

    @Override
    public String toString() {
        return "Square is " + color + ", " +((filled == true)?"filled":"not filled") +" and its has "+ length +" of side";
    }
}
