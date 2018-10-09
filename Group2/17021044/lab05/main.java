/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        circle htr = new circle();
        htr.setRadius(4);
        System.out.println(htr.getArea() +"\n"+ htr.getPerimeter());
        
        rectangle hcn = new rectangle();
        hcn.setWidth(3);
        hcn.setLength(4);
        System.out.println(hcn.getArea() + "\n" + hcn.getPerimeter());
        Square hv = new Square();
        hv.setSide(6);
        System.out.println(hv.getArea());
    }
    
}
