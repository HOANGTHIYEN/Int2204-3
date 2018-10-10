/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
        circle ht=new circle(1.0);
        
        System.out.println(ht.toString());
        System.out.println("Chu vi: "+ht.getPeirmeter()+"\n Dien tich: "+ht.getArea());
        Restangle hcn=new Restangle();
        hcn.setLength(3.4);
        hcn.setWidth(1.4);
          System.out.println(hcn.toString());
        System.out.println("Chu vi: "+hcn.getPeirmeter()+"\n Dien tich: "+hcn.getArea());
        square hv=new square();
        hv.setWidth(3.4);
        
         System.out.println("Chu vi: "+hv.getPeirmeter()+"\n Dien tich: "+hv.getArea());
        
        
    }
}
