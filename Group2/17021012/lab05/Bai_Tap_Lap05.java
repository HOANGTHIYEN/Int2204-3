/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap05;

import bai_tap_lap05.shape.Circle;

/**
 *
 * @author Nguyên Thai
 */
public class Bai_Tap_Lap05 {

    
    public static void main(String[ ] args) {
        QuaCam orange = new QuaCam(30000f ,"Ha Noi" , "08/10/2018" , 25.6f ,"Xanh");
        System.out.println(orange.getGiaBan());
        System.out.println(orange.getNguonGoc());
        System.out.println(orange.getNgayNhap());
        
        QuaTao apple = new QuaTao(25000 , "New Zealand" , "28/09/2018" , 85.3f , "Tao ngon" , "Do" , "Ngot thom" );
        System.out.println(apple.toString());
        System.out.println(apple.getGiaBan());
        System.out.println(apple.getNguonGoc());
        System.out.println(apple.getNgayNhap());
        System.out.println("================");
     
        //Co the khoi tao bang lop cha va lay cac thuoc tinh cua lop con
        QuaCam camcaophong = new Cam_CaoPhong(150000 , "Thanh pho Ho Chi Minh" , "08/11/2017" , 69 ,
                "Xanh vang" ,"Chua thom");
        System.out.println(camcaophong.toString());
        System.out.println(camcaophong.getNgayNhap());
        System.out.println(camcaophong.getNguonGoc());
        System.out.println(camcaophong.getMauSac());
        System.out.println("================");
       
        QuaCam camsanh = new CamSanh(200000 , "Bac Giang" , "05/03/2016" , 594 , "Xanh duong" , "Ngot bui" , false);
        System.out.println(camsanh.toString());
        System.out.println(camsanh.getNguonGoc());
        System.out.println(camsanh.getMauSac());
        System.out.println(camsanh.getGiaBan());
        
       
    }
    
}
