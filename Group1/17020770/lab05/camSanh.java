/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;




public class camSanh extends quaCam{
        public camSanh(){
            
        }
        public camSanh(String mau, int giaBan, String ngonGoc, String ngayNhap, String soLuong){
            super(mau,giaBan, ngonGoc, ngayNhap, soLuong);
        }
        @Override
        public String toString(){
            return "\nCam Sanh: \n   Mau Sac: "+getMau()+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
    }