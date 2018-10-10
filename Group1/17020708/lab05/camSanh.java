/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author nguyen ngoc gioi
 */
public class camSanh extends quaCam{
        public camSanh(){
            
        }
        public camSanh(String mau,String v, double gia, String ng, String nn, int sl){
            super(mau, v, gia, ng, nn, sl);
        }
        public String toString(){
            return "\nCam Sanh: \n   Mau Sac: "+getMauSac()+"\n   Vi: "+getVi()+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
    }
