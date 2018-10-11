package Lap5_ex1;

public class Qua_Tao extends Hoa_Qua {
    public Qua_Tao(String  XuatXu, int SoLuong){
        this.setXuat_xu(XuatXu);
        this.setSo_luong(SoLuong);
    }
    public void ThongSoTao(){
        System.out.println("Táo : ");
        System.out.println("Xuất xứ : "+this.getXuat_xu());
        System.out.println("Số Lượng : "+ this.getSo_luong() + " quả");
        System.out.println();
    }
}
