package Lap5_ex1;

public class Qua_CamSanh extends Hoa_Qua{
    public Qua_CamSanh(int GiaBan,int CanNang,String XuatXu){
        this.setGia_ban(GiaBan);
        this.setCan_nang(CanNang);
        this.setXuat_xu(XuatXu);
    }
    public void ThongSoCamSanh(){
        System.out.println("Cam Sành : ");
        System.out.println("Giá bán : " +this.getGia_ban()+"nghìn đồng");
        System.out.println("Cân nặng : "+this.getCan_nang()+"kg");
        System.out.println("Xuất xứ : "+this.getXuat_xu());
    }
}
