/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author DELL
 */
public class QuaCam extends HoaQua{
    private String muiVi;
    public QuaCam(int giaBan,int soLuong,String nguonGoc,String ngayNhap){
        setGia(giaBan);
        setSoLuong(soLuong);
        setNguonGoc(nguonGoc);
        setNgayNhap(ngayNhap);
    }

    public String getMuiVi() {
        return muiVi;
    }
    public void setMuiVi(String muiVi){
        this.muiVi=muiVi;
    }
}
