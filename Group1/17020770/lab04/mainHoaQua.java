/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;


import java.util.Scanner;

/**
 *
 * @author Việt Hoàng
 */

  
public class mainHoaQua {
    
    
   
    
    public static void main(String[] args) {
        hoaqua h = new hoaqua();
        
        quaTao tao = new quaTao();
        quaCam cam = new quaCam();
       camCaoPhong camCP = new camCaoPhong("xanh",  45000, "Cao Phong", "1/1/2018","1kg");
        camSanh camS = new camSanh("cam",35000,"nhat ban","2/1/2018/","1kg");
        System.out.println(h.toString());
        System.out.println(tao.toString());
        System.out.println(cam.toString());
        System.out.println(camCP.toString());
        System.out.println(camS.toString());
        
        
    }
}
    



