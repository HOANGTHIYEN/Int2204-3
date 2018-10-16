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
public class hoaqua {
        public int giaBan;
        public String nguonGoc;
        public String ngayNhap;
        public String soLuong;
        
    
        public hoaqua(){
            giaBan = 15000;
            nguonGoc = "trung quoc";
            ngayNhap = "1/1/2018";
            soLuong = "1000kg";}
        public hoaqua(int giaBan,String nguonGoc,String ngayNhap,String soLuong ){
    this.giaBan=giaBan;
    this.nguonGoc=nguonGoc;
    this.ngayNhap=ngayNhap;
    this.soLuong=soLuong;
}
        
        public int getGiaBan(){
            return giaBan;
        }public void setGiaBan(int giaBan){
            this.giaBan = giaBan;
        }
        public String getNguonGoc(){
            return nguonGoc;
        }public void setNguonGoc(String nguonGoc){
            this.nguonGoc = nguonGoc;
        }
        public String getNgayNhap(){
            return ngayNhap;
        }public void setNgayNhap(String ngayNhap){
            this.ngayNhap = ngayNhap;
        }
        public String getSoLuong(){
            return soLuong;
        }public void setSoLuong(String soLuong){
            this.soLuong = soLuong;
        }
        
        @Override
        public String toString(){
            return "hoa qua: \n   Gia Ban: "+giaBan+"\n   Nguon Goc: "+nguonGoc+"\n   NgayNhap: "
                    +ngayNhap+"\n   SoLuong: "+soLuong;
        }
    }