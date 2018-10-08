package lab05_hoaqua;

public class HoaQua {
    String NguonGoc;
    String NgayNhap;
    
    public HoaQua() {
        
    }
    
    public HoaQua(String NguonGoc, String NgayNhap) {
        this.NguonGoc = NguonGoc;
        this.NgayNhap = NgayNhap;
    }
        
    public String getNguonGoc() {
        return NguonGoc;
    }
    public void setNguonGoc(String a) {
        this.NguonGoc = a;
    }
    public String getNgayNhap() {
        return NgayNhap;
    }
    public void setNgayNhap(String a) {
        this.NgayNhap = a;
    }
}

 class Apple extends HoaQua {
    int SoLuong;
        
    public int getSoluong() {
        return SoLuong;
    }
    public void setSoLuong(int a) {
        this.SoLuong = a;
    }
}
 class Cam extends HoaQua {
    String Vi;
    public String getVi(){
        return Vi;
    }
    public void setVi (String a) {
        this.Vi = a;
    }
}

 class Fruit extends HoaQua{
    long Gia;
    public long getGia(){
        return Gia;
    }
    public void setGia(long a) {
        this.Gia = a;
    }      
}
class TestHoaQua {
    public static void main (String[] args) {
        Cam C1 = new Cam();
 
        C1.setNgayNhap("17/1/2018");
        C1.setNguonGoc("Ha Noi");
        C1.setVi("Chua");
        System.out.printf("Cam:");
        
        System.out.printf("Ngay nhap: " + C1.getNgayNhap());
        System.out.printf("NguonGoc: " + C1.getNguonGoc());
        System.out.printf("Vi: " + C1.getVi());
    }
}
    
   