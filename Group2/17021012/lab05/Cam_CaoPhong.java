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
//Lop nay ke thua tu lop Qua Cam
public class Cam_CaoPhong extends QuaCam
{
    public Cam_CaoPhong(float giaBan , String nguonGoc , String ngayNhap , float soLuong , String mauSac , String muiVi)
    {
        super(giaBan , nguonGoc , ngayNhap , soLuong , mauSac);
        this.muiVi = muiVi;
    }
    
    public String muiVi;                        //them thuoc tinh muiVi

    public String getMuiVi() {
        return muiVi;
    }

    public void setMuiVi(String muiVi) {
        this.muiVi = muiVi;
    }

    @Override
    public String toString() {
        return "Cam_CaoPhong{" + "muiVi=" + muiVi + '}';
    }
    
}
    
