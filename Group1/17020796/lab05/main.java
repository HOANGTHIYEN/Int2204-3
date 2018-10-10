package bai2;

public class main {
    public static void main(String[] args) {
        shape shape = new shape();
        shape.setColor("blue");
        shape.setFilled(true);
        System.out.println(shape.toString());
        System.out.println();

        Circle circle = new Circle(3, "red", true);
        System.out.println(circle.toString());
        System.out.println();

        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setColor("green");
        rectangle.setFilled(false);
        System.out.println(rectangle.toString());
        System.out.println();

        Square square = new Square(5);
        square.setColor("black");
        square.setFilled(true);
        System.out.println(square.toString());
    }
}
