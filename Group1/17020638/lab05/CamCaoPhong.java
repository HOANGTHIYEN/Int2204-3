package shape;
public class CamCaoPhong extends QuaCam{
    
    String noiban;

    public String getNoiban() {
        return noiban;
    }
    
    public void setNoiban(String noiban) {
        this.noiban = noiban;
    }

    public CamCaoPhong(String noiban, String mau) {
        super(mau);
        this.noiban = noiban;
    }

    public CamCaoPhong( String mau, String ten, int giaban, String nguongoc, String ngaynhap, int soluong,String noiban) {
        super(mau, ten, giaban, nguongoc, ngaynhap, soluong);
        this.noiban = noiban;
    }

    @Override
    public String toString() {
        return "ten=" + ten + ", giaban1kg=" + giaban1kg + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluongkg=" + soluongkg + ", noiban=" + noiban ;
    }

    
    
}
