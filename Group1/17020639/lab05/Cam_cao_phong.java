package javaapplication3;

public class Cam_cao_phong extends Qua_cam{

    public Cam_cao_phong(String gia_ban, String nguon_goc, String ngay_nhap, String so_luong) {
        super(gia_ban, nguon_goc, ngay_nhap, so_luong);
    }
    public static void print (Cam_cao_phong a)
    {
        System.out.println("Gia ban :"+a.gia_ban);
        System.out.println("Ngay ngap :"+a.ngay_nhap);
        System.out.println("Nguon goc :"+a.nguon_goc);
        System.out.println("So luong :"+a.so_luong);
    }
    
}
