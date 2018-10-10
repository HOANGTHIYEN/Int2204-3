/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;


public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hoaqua  hq=new hoaqua("vietnam",16,"ngạy 15"); 
        System.out.println("xuat xu tu : "+hq.getxx());
        System.out.println("gia : "+hq.getgia());   
        System.out.println("nhap tu ngay : "+hq.getday());
    orange o=new orange("vietnam",20,"ngay 15");
        System.out.println("xuat xu cam tu :"+o.getxx());
        System.out.println("gia cam : "+o.getgia());
        System.out.println("ngay nhap cam tu : "+o.getday());
        camcp cp=new camcp("vietnam",30," ngay 17");
        System.out.println("xuat xu cam cao phong tu :"+cp.getxx());
        System.out.println("gia cam cao phong : "+cp.getgia());
        System.out.println("ngay nhap cam cao phong tu : "+cp.getday());
        cams cs =new cams("vietnam",24,"ngay 15");
        System.out.println("xuat xu cam sanh tu :"+cs.getxx());
        System.out.println("gia cam sanh : "+cs.getgia());
        System.out.println("ngay nhap cam sanh tu : "+cs.getday());
       apple t=new apple("chine",10,"ngay 15");
       System.out.println("xuat xu cam tu :"+t.getxx());
        System.out.println("gia cam : "+t.getgia());
        System.out.println("ngay nhap cam tu : "+t.getday());
        
    }
   
}
