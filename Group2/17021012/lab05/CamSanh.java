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

// Lop CamSanh lai ke thua tu lop QuaCam  - lop chau cua HoaQua
public class CamSanh extends QuaCam
{
    public CamSanh(float giaBan , String nguonGoc , String ngayNhap , float soLuong , 
            String mauSac , String Vi, boolean Cohat)
    {
        super(giaBan , nguonGoc , ngayNhap , soLuong , mauSac);
        this.Vi = Vi;
        this.Cohat = Cohat;
    }
    public boolean Cohat;                           // co them hai thuoc tinh Cohat va Vi
    public String Vi;

    public boolean isCohat() {
        return Cohat;
    }

    public void setCohat(boolean Cohat) {
        this.Cohat = Cohat;
    }

    public String getVi() {
        return Vi;
    }

    public void setVi(String Vi) {
        this.Vi = Vi;
    }
    
    public void gioithieu(){
        System.out.println("Cam Sanh an mat va bo");
    }
    @Override
    public String toString() {
        return "CamSanh{" + "Cohat=" + Cohat + ", Vi=" + Vi + '}';
    }

   
    
}
