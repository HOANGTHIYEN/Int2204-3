
import java.util.Date;

public class Hoa_Qua {
    double gia_ban;                                                             //gia ban tren 1kg
    String nguon_goc;
    Date ngay_nhap;
    int so_luong;
    int kcal;

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public double getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(double gia_ban) {
        this.gia_ban = gia_ban;
    }

    public String getNguon_goc() {
        return nguon_goc;
    }

    public void setNguon_goc(String nguon_goc) {
        this.nguon_goc = nguon_goc;
    }

    public Date getNgay_nhap() {
        return ngay_nhap;
    }

    public void setNgay_nhap(Date ngay_nhap) {
        this.ngay_nhap = ngay_nhap;
    }


    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }
    
}
