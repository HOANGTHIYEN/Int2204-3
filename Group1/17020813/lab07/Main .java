/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

/**
 *
 * @author CCNE
 */
public class Main{

    public static void main(String[] args) {
        Square test = new Square(4.0,"red",true);     
        test.setLength(3.0);
        System.out.println(test.toString());
        System.out.println(test.getArea());
        System.out.println(test.getPerimeter());
        Circle test2 = new Circle();
        test2.setRadius(10);
        System.out.println(test2.getArea());
        System.out.println(test2.getPerimeter());
    }
    
}
