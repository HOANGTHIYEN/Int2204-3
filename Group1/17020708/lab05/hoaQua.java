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
public class hoaQua {
        protected double giaBan;
        public double getGiaBan(){
            return giaBan;
        }public void setGiaBan(double giaBan){
            this.giaBan = giaBan;
        }
        protected String nguonGoc;
        public String getNguonGoc(){
            return nguonGoc;
        }public void setNguonGoc(String nguonGoc){
            this.nguonGoc = nguonGoc;
        }
        protected String ngayNhap;
        public String getNgayNhap(){
            return ngayNhap;
        }public void setNgayNhap(String ngayNhap){
            this.ngayNhap = ngayNhap;
        }
        protected int soLuong;
        public int getSoLuong(){
            return soLuong;
        }public void setSoLuong(int soLuong){
            this.soLuong = soLuong;
        }
        public hoaQua(){
            giaBan = 15.5;
            nguonGoc = "Viet Nam";
            ngayNhap = "25/9/2018";
            soLuong = 200;
        }
        public hoaQua(double gia, String ng, String nn, int sl){
            giaBan = gia;
            nguonGoc = ng;
            ngayNhap = nn;
            soLuong = sl;
        }
        public String toString(){
            return "Hoa Qua: \n   Gia Ban: "+giaBan+"\n   Nguon Goc: "+nguonGoc+"\n   NgayNhap: "
                    +ngayNhap+"\n   SoLuong: "+soLuong;
        }
    }
