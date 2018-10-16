package lb5;

public class HoaQua {
    protected String ten;
    protected String loai;
    protected String xuatsu;
    protected String gia;
    //getter và setter
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten = ten;
    }

    public String getloai(){
        return loai;
    }
    public void setloai(){
        this.loai = loai;
    }

    public String getxs(){
        return xuatsu;
    }
    public void setxs(String xuatsu){
        this.xuatsu = xuatsu;
    }

    public String getgia(){
        return gia;
    }
    public void setgia(String gia){
        this.gia = gia;
    }
    //Khở tạo
    public HoaQua(String ten, String loai, String xuatsu, String gia)
    {
        this.ten = ten;
        this.loai = loai;
        this.xuatsu = xuatsu;
        this.gia = gia;
    }

    public String toString(){
        return "Tên: " + ten + "    Loại: " + loai + "    Xuất sứ: " + xuatsu + "    Giá: " + gia;
    }
}
