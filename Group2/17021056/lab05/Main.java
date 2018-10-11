/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package câu.pkg2.lab05;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args){
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("pink",false);
        System.out.println(shape2);
        
    //  shape1.setColor("blue");
   //   shape1.setFilled(true);
    //  System.out.println(shape1);// toString() to inspect the modified instance
     // System.out.println("The color is: " + shape1.getColor());
  //    System.out.println("The filled is: " + shape1.isFilled());
      
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(4.0);
        System.out.println(circle2);
        Circle circle3 = new Circle(2.36,"green",false);
        System.out.println(circle3);

        circle1.setRadius(3.14);
        circle1.setColor("black");
        circle1.setFilled(true);
        System.out.println(circle1);
        System.out.println("The radius is: " + circle1.getRadius());
        System.out.println("The color is: " + circle1.getColor());
        System.out.println("The filled is: " + circle1.isFilled());

        System.out.printf("The area is: %.2f%n", circle1.getArea());
        System.out.printf("The perimeter is: %.2f%n", circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(3.2,6.7);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(4.6,5.2,"black",true);
        System.out.println(rectangle3);

        rectangle1.setWidth(9.6);
        rectangle1.setLength(10.6);
        rectangle1.setColor("white");
        rectangle1.setFilled(false);
        System.out.println(rectangle1);
        System.out.println("The width is: " + rectangle1.getWidth());
        System.out.println("The length is: " + rectangle1.getLength());
        System.out.println("The color is: " + rectangle1.getColor());
        System.out.println("The filled is: " + rectangle1.isFilled());

        System.out.printf("The area is: %.2f%n", rectangle1.getArea());
        System.out.printf("The perimeter is: %.2f%n", rectangle1.getPerimeter());

        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(6);
        
        System.out.println(square2);
        Square square3 = new Square(8.4,"blue",false);
        System.out.println(square3);

        square1.setSide(7.9);
        square1.setWidth(6);
        square1.setColor("pink");
        square1.setFilled(false);
        System.out.println(square1);
        System.out.println("The side is: " + square1.getSide());
        System.out.println("The color is: " + square1.getColor());
        System.out.println("The filled is: " + square1.isFilled());

        System.out.printf("The area is: %.2f%n", square1.getArea());
        System.out.printf("The perimeter is: %.2f%n", square1.getPerimeter());
    }
}
