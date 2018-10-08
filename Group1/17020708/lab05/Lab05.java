/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author nguyen ngoc gioi
 */
public class Lab05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hoaQua qua = new hoaQua();
        
        quaTao tao = new quaTao();
        quaCam cam = new quaCam();
        camCaoPhong camCP = new camCaoPhong("xanh", "ngot", 15.5, "Viet Nam", "27/3/2018", 300);
        camSanh camS = new camSanh();
        System.out.print(qua.toString());
        System.out.print(tao.toString());
        System.out.print(cam.toString());
        System.out.print(camCP.toString());
        System.out.print(camS.toString());
        
        
    }
}
