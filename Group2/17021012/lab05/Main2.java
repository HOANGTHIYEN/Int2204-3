/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap05.shape;

/**
 *
 * @author Nguyen Thai
 */
public class Main2 {
    public static void main(String[] args) {
        
        Circle tron = new Circle(5.6);
        System.out.println(tron.toString());
        System.out.println("Dien tich hinh tron la: ");
        System.out.format("%.2f",tron.getArea(5.6));
        System.out.println("");
        System.out.println("Chu vi hinh tron la: ");
        System.out.format("%.2f",tron.getPerimeter(5.6));
        System.out.println("");
        
        Rectangle hcn = new Rectangle();
        System.out.println(hcn.toString());
        System.out.format("Chu vi hinh chu nhat la: %.2f" , hcn.getPerimeter());
        System.out.println("");
        System.out.format("Dien tich hinh chu nhat la: %.2f", hcn.getArea());
        System.out.println("");
        
        
        Square hv = new Square();
        System.out.println(hv.toString());
        System.out.println(hv.getArea());
    }
}
