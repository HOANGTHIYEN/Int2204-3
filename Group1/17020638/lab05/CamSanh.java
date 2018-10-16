package shape;

public class CamSanh extends QuaCam{
    String vi;

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public CamSanh(String vi, String mau) {
        super(mau);
        this.vi = vi;
    }

    public CamSanh(String vi, String mau, String ten, int giaban, String nguongoc, String ngaynhap, int soluong) {
        super(mau, ten, giaban, nguongoc, ngaynhap, soluong);
        this.vi = vi;
    }

    @Override
    public String toString() {
        return "ten=" + ten + ", giaban1kg=" + giaban1kg + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluongkg=" + soluongkg + ", vi=" + vi ;
    }

    
    
    
}
