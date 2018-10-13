/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Admin
 */
public class classMain {
    public static void main(String[] args) {
        camCaoPhong cam = new camCaoPhong();
        cam.setTenString("cam-cao-phong ");
        cam.setMauString("xanh ");
        cam.setNguonGocString("Cao-Phong ");
        cam.setGiaTienString("100-nghin ");
        System.out.println(cam.getInfoString());
        camSanh camS = new camSanh();
        camS.setTenString("cam-sanh ");
        camS.setMauString("vang ");
        camS.setNguonGocString("Ha Giang ");
        camS.setGiaTienString("200-nghin ");
        System.out.println(camS.getInfoString());
        quaTao tao = new quaTao();
        tao.setTenString("tao ");
        tao.setMauString("vang cam ");
        tao.setNguonGocString("Trung Quoc ");
        tao.setGiaTien("30-  ");
        System.out.println(tao.getInfoString());
    }
}
