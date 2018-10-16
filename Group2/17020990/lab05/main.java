/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Quoc
 */
public class main {
   public static void main(String[] args) {
        // TODO code application logic here
        Shape a = new Shape("red", true);
        System.out.println(a.toString());
        
        Circle b = new Circle(2);
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(b.toString());
        
        Rectangle c = new Rectangle(5,9);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.toString());
        
        Square d = new Square(4);
        System.out.println(d.getArea());
        d.setSide(9);
        System.out.println(d.getPerimeter());
        System.out.println(d.toString());
    }
    
}
