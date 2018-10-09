package shape;
public class QuaCam extends HoaQua{
    String mau;

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public QuaCam(String mau) {
        this.mau = mau;
    }

    public QuaCam(String mau, String ten, int giaban, String nguongoc, String ngaynhap, int soluong) {
        super(ten, giaban, nguongoc, ngaynhap, soluong);
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "ten=" + ten + ", giaban1kg=" + giaban1kg + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluongkg=" + soluongkg+ "mau=" + mau ;
    }

    

}
