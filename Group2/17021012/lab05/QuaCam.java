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
// Lop QuaCam ke thua mot vai thuoc tinh cua lop cha HoaQua
public class QuaCam extends HoaQua
{

    public QuaCam(float giaBan , String nguonGoc , String ngayNhap , float soLuong , String mauSac)
    {
        super(giaBan , nguonGoc , ngayNhap , soLuong);
        this.mauSac = mauSac;
    }
    public String mauSac;                                               //them thuoc tinh mauSac cho lop QuaCam

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "QuaCam{" + "mauSac=" + mauSac + '}';
    }
    
}
    
