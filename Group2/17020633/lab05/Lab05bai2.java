/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05bai2;

/**
 *
 * @author Dell
 */
public class Lab05bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle hinhtron=new circle();
        System.out.println(hinhtron.getArea()+" "+hinhtron.getPerimeter());
        rectangle hcn=new rectangle();
        System.out.println(hcn.getArea()+" "+hcn.getPerimeter());
        square hinhvuong=new square( );
        System.out.println(hinhvuong.getArea());
    }
    
}
