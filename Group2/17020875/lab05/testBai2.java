public class testBai2 {
    public static void main(String args[]) {
        /*shape*/
        Shape shape1 = new Shape();
        System.out.println(shape1.getColor() + " " + shape1.isFilled());

        Shape shape2 = new Shape("green", false);
        System.out.println(shape2.getColor() + " " + shape2.isFilled());

        Shape shape3 = new Shape();
        shape3.setColor("blue");
        shape3.setFilled(true);

        System.out.println(shape3.getColor() + " " + shape3.isFilled());

        System.out.println("---------------------------------------------");
        /*circle*/

        Circle circle1 = new Circle();
        System.out.print("circle1: " + "R=" + circle1.getRadius() + " S=" + circle1.getArea() + " C=");
        System.out.println(circle1.getPerimeter() + " color:" + circle1.getColor() + " fill:" + circle1.isFilled());

        Circle circle2 = new Circle(2.3);
        System.out.print("circle2: " + "R=" + circle2.getRadius() + " S=" + circle2.getArea() + " C=");
        System.out.println(circle2.getPerimeter() + " color:" + circle2.getColor() + " fill:" + circle2.isFilled());

        Circle circle3 = new Circle(3.4, "yellow", false);
        System.out.print("circle3: " + "R=" + circle3.getRadius() + " S=" + circle3.getArea() + " C=");
        System.out.println(circle3.getPerimeter() + " color:" + circle3.getColor() + " fill:" + circle3.isFilled());
         System.out.println("---------------------------------------------");

        /*Rectangle*/

        Rectangle rectangle1 = new Rectangle();
        System.out.print("Rectangle1: " + "width:" + rectangle1.getWidth() + " length:" + rectangle1.getLength() + " color:" + rectangle1.getColor());
        System.out.println(" fill:" + rectangle1.isFilled() + " S=" + rectangle1.getArea() + " C=" + rectangle1.getPerimeter() );

        Rectangle rectangle2 = new Rectangle(2.3, 4.5);
        System.out.print("Rectangle2: " + "width:" + rectangle2.getWidth() + " length:" + rectangle2.getLength() + " color:" + rectangle2.getColor());
        System.out.println(" fill:" + rectangle2.isFilled() + " S=" + rectangle2.getArea() + " C=" + rectangle2.getPerimeter() );
        
        Rectangle rectangle3 = new Rectangle(1.2,5.6,"grey", true);
        System.out.print("Rectangle3: " + "width:" + rectangle3.getWidth() + " length:" + rectangle3.getLength()+ " color:" + rectangle3.getColor());
        System.out.println(" fill:" + rectangle3.isFilled() + " S=" + rectangle3.getArea() + " C=" + rectangle3.getPerimeter() );

         System.out.println("---------------------------------------------");
         /* Square*/
        Square square1 = new Square();
        System.out.print("Square1: " + " side=" + square1.getSide() + " color:" + square1.getColor() + " fill:" + square1.isFilled());
        System.out.println(" S=" + square1.getArea() + " C=" + square1.getPerimeter());

        Square square2 = new Square(2);
        System.out.print("Square2: " + " side=" + square2.getWidth() + " color:" + square2.getColor() + " fill:" + square2.isFilled());
        System.out.println(" S=" + square2.getArea() + " C=" + square2.getPerimeter());

        Square square3 = new Square(3, "pink", true);
        System.out.print("Square3: " + " side=" + square3.getSide() + " color:" + square3.getColor() + " fill:" + square3.isFilled());
        System.out.println(" S=" + square3.getArea() + " C=" + square3.getPerimeter());

    }
}