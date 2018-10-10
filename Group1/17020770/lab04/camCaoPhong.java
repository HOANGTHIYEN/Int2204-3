/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Việt Hoàng
 */
public class camCaoPhong extends quaCam{
        public camCaoPhong(){
            
        }
        public camCaoPhong(String mau, int giaBan, String ngonGoc, String ngayNhap, String soLuong){
            super(mau,giaBan, ngonGoc, ngayNhap, soLuong);}
        @Override
        public String toString(){
            return "\nCam Cao Phong: \n   Mau Sac: "+getMau()+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
        }