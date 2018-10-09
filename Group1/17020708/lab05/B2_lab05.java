/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_lab05;

/**
 *
 * @author nguyen ngoc gioi
 */
public class B2_lab05 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        shape s = new shape();
        System.out.print(s.toString());
        circle ht = new circle();
        
        System.out.print(ht.toString());
        
        rectangle cn = new rectangle(2,2,"blue", false);
        System.out.print(cn.toString());
        square hv = new square(5);
        System.out.print(hv.toString());
       hv.setWidth(4);
       hv.setSide(3);
        System.out.print("   Length: "+hv.getLength()+"\n");
        System.out.print(hv.toString());
        
    }
}
