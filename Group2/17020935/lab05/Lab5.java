/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;


/**
 *
 * @author DELL
 */
public class Lab5 {

    
    public static void main(String[] args) {
        System.out.println("Bai1");
         System.out.println("test for cam");
        CamCaoPhong camCaoPhong=new CamCaoPhong(150000, 20, "My","1/1/1009" , "ngot");
        CamSanh camSanh=new CamSanh(0, 0, "dd", "12/2/1008", "chua");
        System.out.println(camCaoPhong.getGiaBan());
        System.out.println(camCaoPhong.getMuiVi());
        System.out.println(camCaoPhong.getNgayNhap());
        System.out.println(camCaoPhong.getNguonGoc());
        System.out.println(camCaoPhong.getSoLuong());
        System.out.println(camSanh.getGiaBan());
        System.out.println(camSanh.getMuiVi());
        System.out.println(camSanh.getNgayNhap());
        System.out.println(camSanh.getNguonGoc());
        System.out.println(camSanh.getSoLuong());
     
        
        System.out.println("Bai2");
        System.out.println("--------test for Shape-----------");
       Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("pink",false);
        System.out.println(shape2);

        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println(shape1);
        System.out.println("The color: " + shape1.getColor());
        System.out.println("The filled: " + shape1.isFilled());

        System.out.println("--------test for Circle---------");
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(1.3);
        System.out.println(circle2);
        Circle circle3 = new Circle(3.5,"green",false);
        System.out.println(circle3);

        circle1.setRadius(3.57);
        circle1.setColor("black");
        circle1.setFilled(true);
        System.out.println(circle1);
        System.out.println("The radius: " + circle1.getRadius());
        System.out.println("The color: " + circle1.getColor());
        System.out.println("The filled: " + circle1.isFilled());

        System.out.printf("The area: %.2f%n", circle1.getArea());
        System.out.printf("The perimeter: %.2f%n", circle1.getPerimeter());

        System.out.println("--------test for Rectangle-------");
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(4.1,2.8);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(9.2,1.2,"yellow",true);
        System.out.println(rectangle3);

        rectangle1.setWidth(9.6);
        rectangle1.setLength(10.6);
        rectangle1.setColor("green");
        rectangle1.setFilled(true);
        System.out.println(rectangle1);
        System.out.println("The width: " + rectangle1.getWidth());
        System.out.println("The length: " + rectangle1.getLength());
        System.out.println("The color: " + rectangle1.getColor());
        System.out.println("The filled: " + rectangle1.isFilled());

        System.out.printf("The area: %.2f%n", rectangle1.getArea());
        System.out.printf("The perimeter: %.2f%n", rectangle1.getPerimeter());

        System.out.println("----------test for Square----------");
        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(6.7);
        System.out.println(square2);

        square1.setSide(3);
        square1.setWidth(3.8);
        square1.setColor("gray");
        square1.setFilled(false);
        System.out.println(square1);
        System.out.println("The color: " + square1.getColor());
        System.out.println("The filled: " + square1.isFilled());

        System.out.printf("The area: %.2f%n", square1.getArea());
        System.out.printf("The perimeter: %.2f%n", square1.getPerimeter());
    }
    
}
