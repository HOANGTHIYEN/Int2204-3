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
public class quaTao extends hoaqua{
        public String mau;
       public quaTao(){
           mau="do";
       }
        public quaTao(String mau, int giaBan, String nguonGoc, String ngayNhap, String soLuong){
            super(giaBan, nguonGoc,ngayNhap, soLuong);
            this.mau = mau;
        }

    
        public String getMau(){
            return mau;
        }
        public void setMau(String mau){
            this.mau = mau;
        }
        
       
        
        @Override
        public String toString(){
            return "\nQua Tao: \n   Loai Tao: "+mau+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
        
    }