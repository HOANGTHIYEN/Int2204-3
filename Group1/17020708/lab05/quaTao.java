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
public class quaTao extends hoaQua{
        protected String loaiTao;
        public String getLoaiTao(){
            return loaiTao;
        }
        public void setLoaiTao(String loaiTao){
            this.loaiTao = loaiTao;
        }
        public quaTao(){
            loaiTao = "Tao xanh";
        }
        public quaTao(String loai){
            loaiTao = loai;
        }
        public quaTao(String loai, double gia, String ng, String nn, int sl){
            super(gia, ng,nn, sl);
            loaiTao = loai;
            
        }
        public String toString(){
            return "\nQua Tao: \n   Loai Tao: "+loaiTao+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
        
    }
