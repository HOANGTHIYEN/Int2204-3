package shape;
public class QuaTao extends HoaQua{
    
    String ngayban;
    public QuaTao(){
        
    }

    public QuaTao(String ngayban) {
        this.ngayban = ngayban;
    }

    public QuaTao(String ten,int giaban,String nguongoc,String ngaynhap,int soluong,String ngayban){
        super(ten,giaban,nguongoc,ngaynhap,soluong);
        this.ngayban = ngayban;
    }
    
    public String getNgayban() {
        return ngayban;
    }
    
    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    @Override
    public String toString() {
        return "ten=" + ten + ", giaban1kg=" + giaban1kg + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluongkg=" + soluongkg+", ngayban="+ngayban;
    }

    

    
}
