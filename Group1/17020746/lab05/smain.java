package lb5;

public class smain {
    public static void main(String[] args) {
        Shape sp = new Shape();
        System.out.println("Shape: " + sp.toString());

        Circle circle = new Circle(5.0);
        System.out.println("Circle: " + circle.toString());

        Rectangle rectangle = new Rectangle(4.0, 3.0);
        System.out.println("Rectangle: " + rectangle.toString());

        Square square = new Square(5.0);
        System.out.println("S = " + square.getArea());
        square.setLength(10);
        System.out.println("L = " + square.getLength());
        System.out.println("W = " + square.getWidth());
        System.out.println("Square: " + square.toString());
    }
}
