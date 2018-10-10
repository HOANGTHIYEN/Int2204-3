/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1.Lab05;

/**
 *
 * @author Administrator
 */
public class   HoaQua {
    String LoaiQua;  
    String NguonGoc;
    String Gia;
    String NgayNhap;
    String ThuocTinh;

    public String getThuocTinh() {
        return ThuocTinh;
    }

    public void setThuocTinh(String ThuocTinh) {
        this.ThuocTinh = ThuocTinh;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }
    
    public String getLoaiQua() {
        return LoaiQua;
    }

    public void setLoaiQua(String LoaiQua) {
        this.LoaiQua = LoaiQua;
    }

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String NguonGoc) {
        this.NguonGoc = NguonGoc;
    }
    
    public String Getinfo() {
        return "Loại Quả :" + LoaiQua +"\nNguồn Gốc : "+NguonGoc+ "\nNgày Nhập : "+NgayNhap +"\nGia : "+Gia +"\nThuộc Tính : " +ThuocTinh ;
       
    }
}
