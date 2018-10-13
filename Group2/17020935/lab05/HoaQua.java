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
public class HoaQua {
        private int giaBan ;
        private int soLuong;
        private String nguonGoc;
        private String ngayNhap;
        
        
        public void setGia(int giaBan){
            this.giaBan=giaBan;
        }
        public void setSoLuong(int soLuong){
            this.soLuong=soLuong;
        }
        public void setNguonGoc(String nguonGoc){
            this.nguonGoc=nguonGoc;
        }
        public void setNgayNhap(String ngayNhap){
            this.ngayNhap=ngayNhap;
        }

         public int getGiaBan() {
            return giaBan;
         }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public int getSoLuong() {
        return soLuong;
    }
        
}
