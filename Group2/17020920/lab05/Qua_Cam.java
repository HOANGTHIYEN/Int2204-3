package Lap5_ex1;

public class Qua_Cam extends Hoa_Qua {
    public Qua_Cam(int GiaBan, int CanNang){
        this.setGia_ban(GiaBan);
        this.setCan_nang(CanNang);
    }
    public void ThongSoCam(){
        System.out.println("Cam : ");
        System.out.println("Giá bán : " + this.getGia_ban() +" nghìn đồng");
        System.out.println("Cân nặng : "+this.getCan_nang() + " kg");
        System.out.println();
    }
}
