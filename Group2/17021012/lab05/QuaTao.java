/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap05;

/**
 *
 * @author Nguyen Thai
 */

//Lop QuaTao ke thua thuoc tinh tu lop HoaQua
public class QuaTao extends HoaQua
{
    public QuaTao(float giaBan , String nguonGoc , String ngayNhap , float soLuong , String tenloaitao, 
            String mauSac, String huongVi)
    {
        super(giaBan , nguonGoc , ngayNhap , soLuong);      //tro toi cac thuoc tinh tu lop cha luon
        this.tenloaitao = tenloaitao;
        this.mauSac = mauSac;
        this.huongVi = huongVi;
    }
    
    public String tenloaitao;
    public String huongVi;
    public String mauSac;

    public String getTenloaitao() {
        return tenloaitao;
    }

    public void setTenloaitao(String tenloaitao) {
        this.tenloaitao = tenloaitao;
    }

    public String getHuongVi() {
        return huongVi;
    }

    public void setHuongVi(String huongVi) {
        this.huongVi = huongVi;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "QuaTao{" + "tenloaitao=" + tenloaitao + ", huongVi=" + huongVi + ", mauSac=" + mauSac + '}';
    }
    
}
