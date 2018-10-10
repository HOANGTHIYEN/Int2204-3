package shape;

public class HoaQua {
    String ten;
    int giaban1kg;
    String nguongoc;
    String ngaynhap;
    int soluongkg;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiaban1kg() {
        return giaban1kg;
    }

    public void setGiaban1kg(int giaban1kg) {
        this.giaban1kg = giaban1kg;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluongkg() {
        return soluongkg;
    }

    public void setSoluongkg(int soluongkg) {
        this.soluongkg = soluongkg;
    }

    public HoaQua(){
        
    }
 
    public HoaQua(String ten,int giaban, String nguongoc, String ngaynhap, int soluong){
        this.ten=ten;
        this.giaban1kg = giaban;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluongkg = soluong;
    }

    @Override
    public String toString() {
        return "HoaQua{" + "ten=" + ten + ", giaban1kg=" + giaban1kg + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluongkg=" + soluongkg + '}';
    }
    
    
}
