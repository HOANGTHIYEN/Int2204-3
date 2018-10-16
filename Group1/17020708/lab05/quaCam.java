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
public class quaCam extends hoaQua{
        protected String mauSac;
        public String getMauSac(){
            return mauSac;
        }
        public void setMauSac(String mauSac){
            this.mauSac = mauSac;
        }
        protected String vi;
        public String getVi(){
            return vi;
        }
        public void setVi(String vi){
            this.vi = vi;
        }
        
       public quaCam(){
            mauSac = "Cam";
            vi = "ngot";
        }
        public quaCam(String mau, String v){
            mauSac = mau;
            vi = v;
        }
        public quaCam(String mau,String v, double gia, String ng, String nn, int sl){
            super(gia, ng, nn, sl);
            mauSac = mau;
            vi = v;
            
        }
        @Override
        public String toString(){
            return "\nQua Cam: \n   Mau Sac: "+mauSac+"\n   Vi: "+vi+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
    }
