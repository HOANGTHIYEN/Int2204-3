/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        
        
        camsanh cs=new camsanh();
        cs.setTen("Cam sành");
        cs.setMau("Lục nhạt");
        cs.setNgaynhap("20/9/2018");
        cs.setNguongoc("Đồng nai");
        cs.setGiaban("15000");
        cs.setSoluong("1000");
        System.out.println(cs.getInfo());
        
        quaacamphong cp=new quaacamphong();
        cp.setTen("Cam phong");
        cp.setMau("Cam");
        cp.setNgaynhap("20/8/2018");
        cp.setVi("Ngọt");
        cp.setSoluong("10000");
        System.out.println(cp.getInfo());
        
        quatao tao=new quatao();
        tao.setTen("Quả táo");
        tao.setMau("Tím");
        tao.setNgaynhap("20/9/2018");
        tao.setNguongoc("Hòa bình");
        tao.setGiaban("13000");
        
        System.out.println(tao.getInfo());
        
    }
}
