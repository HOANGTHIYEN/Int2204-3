
package javaapplication3;

public class Hoa_qua {
    protected String gia_ban,nguon_goc,ngay_nhap,so_luong;

    public String getGia_ban() {
        return gia_ban;
    }

    public String getNguon_goc() {
        return nguon_goc;
    }

    public String getNgay_nhap() {
        return ngay_nhap;
    }

    public String getSo_luong() {
        return so_luong;
    }

    public void setGia_ban(String gia_ban) {
        this.gia_ban = gia_ban;
    }

    public void setNguon_goc(String nguon_goc) {
        this.nguon_goc = nguon_goc;
    }

    public void setNgay_nhap(String ngay_nhap) {
        this.ngay_nhap = ngay_nhap;
    }

    public void setSo_luong(String so_luong) {
        this.so_luong = so_luong;
    }

    public Hoa_qua(String gia_ban, String nguon_goc, String ngay_nhap, String so_luong) {
        this.gia_ban = gia_ban;
        this.nguon_goc = nguon_goc;
        this.ngay_nhap = ngay_nhap;
        this.so_luong = so_luong;
    }

}
