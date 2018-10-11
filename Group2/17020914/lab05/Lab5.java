/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author admin
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("------ Bai 1 ------");
        HoaQua fruid = new HoaQua(20000,100,"world");
        QuaTao apple = new QuaTao(20000,30,"American");
        QuaCam orange = new QuaCam(20000,40,"Vietnam",true);
        CamCaoPhong orange1 = new CamCaoPhong(30000,35,"Vietnam",false);
        CamSanh orange2 = new CamSanh(25000,37,"Vietnam",true);
        System.out.println("tao "+apple);
        System.out.println("camcaophong "+orange1);
        System.out.println("camsanh "+orange2);
        
        System.out.println("------ Bai 2 ------");
        
        System.out.println("Shape");
        Shape o1 = new Shape();
        Shape o2 = new Shape("blue",false);
        System.out.println(o1);
        System.out.println(o2);
        
        System.out.println("Circle");
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.2);
        Circle c3 = new Circle(3.2,"yellow",true);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        System.out.println("Rectangle");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.5, 4.8);
        Rectangle r3 = new Rectangle(3.6, 5.3, "black", true);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        
        System.out.println("Square");
        Square s1 = new Square();
        Square s2 = new Square(3.0);
        Square s3 = new Square(4.0, "green", false);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
