public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape);
        Square square = new Square();
        square.setSide(5.0);
        square.setColor("pink");
        square.setFilled(true);
        square.setLength(3.0);
        System.out.println(square.width);
        System.out.println(square.getArea());
        System.out.println(square);
    }
}











