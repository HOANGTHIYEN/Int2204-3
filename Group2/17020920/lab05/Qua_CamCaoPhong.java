package Lap5_ex1;

public class Qua_CamCaoPhong extends Hoa_Qua{
    public Qua_CamCaoPhong(String NgayNhap){
        this.setNgay_nhap(NgayNhap);
    }
    private String ThuongHieu = "Cao Phong";
    public void setThuongHieu(String n){
        ThuongHieu=n;
    }
    public String getThuongHieu(){
        return ThuongHieu;
    }
    public void ThongSoCamCaoPhong(){
        System.out.println("Cam Cao Phong : ");
        System.out.println("Ngày Nhập : "+this.getNgay_nhap());
        System.out.println("Thương Hiệu :"+this.getThuongHieu());
        System.out.println();
    }
}
