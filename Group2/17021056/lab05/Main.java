/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1.Lab05;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
            CamCaoPhong Cam = new CamCaoPhong();
            Cam.LoaiQua ="Cam";
            Cam.LoaiCam ="Cam Cao Phong";
            Cam.getinfo();
            Cam.NguonGoc ="Hòa Bình";
            Cam.Gia ="40000-50000 VNĐ/kg";
            Cam.NgayNhap ="22/6/2018";
            Cam.ThuocTinh = "Cam Cao Phong có màu vàng nhạt, quả to, mọng nước . ";
            System.out.println(Cam.Getinfo());
            CamSanh Cam1 = new CamSanh();
            Cam1.LoaiQua ="Cam";
            Cam1.LoaiCam ="Cam Sành";
            Cam1.getinfo();
            Cam1.NguonGoc ="Hà Giang";
            Cam1.Gia ="25000-30000  VNĐ/kg";
            Cam1.NgayNhap ="23/6/2018";
            Cam1.ThuocTinh = " vỏ dày, sần, lõi cam vàng sậm, có hạt, ăn có vị ngọt khé lẫn vị chua dôn dốt, đậm đà. ";
            System.out.println(Cam1.Getinfo());
            QuaTao Tao = new QuaTao();
            Tao.LoaiQua ="Táo";
            Tao.LoaiTao ="Táo envy ";
            Tao.getinfo();
            Tao.NguonGoc ="NEWZELAND";
            Tao.Gia ="120000 VNĐ/kg";
            Tao.NgayNhap ="23/6/2018";
            Tao.ThuocTinh = " Táo envy quả to,tròn,bóng,vỏ mỏng màu đỏ điểm thêm các sọc màu vàng,chắc thịt, ăn giòn, ngọt đậm, dậy mùi thơm đặc trưng.";
            System.out.println(Tao.Getinfo());
    }
    
}
