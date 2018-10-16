/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Admin
 */

class Lab05 {
        private double giaBan;
        public double getGiaBan(){
            return giaBan;
        }public void setGiaBan(double giaBan){
            this.giaBan = giaBan;
        }
        private String nguonGoc;
        public String getNguonGoc(){
            return nguonGoc;
        }public void setNguonGoc(String nguonGoc){
            this.nguonGoc = nguonGoc;
        }
        private String ngayNhap;
        public String getNgayNhap(){
            return ngayNhap;
        }public void setNgayNhap(String ngayNhap){
            this.ngayNhap = ngayNhap;
        }
        private int soLuong;
        public int getSoLuong(){
            return soLuong;
        }public void setSoLuong(int soLuong){
            this.soLuong = soLuong;
        }
        Lab05(){
            giaBan = 15.5;
            nguonGoc = "Viet Nam";
            ngayNhap = "25/9/2018";
            soLuong = 200;
        }
        Lab05(double gia, String ng, String nn, int sl){
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
    class quaTao extends Lab05{
        private String loaiTao;
        public String getLoaiTao(){
            return loaiTao;
        }
        public void setLoaiTao(String loaiTao){
            this.loaiTao = loaiTao;
        }
        quaTao(){
            loaiTao = "Tao xanh";
        }quaTao(String loai){
            loaiTao = loai;
        }quaTao(String loai, double gia, String ng, String nn, int sl){
            super(gia,ng,nn,sl);
            loaiTao = loai;
        }
        public String toString(){
            return "\nQua Tao: \n   Loai Tao: "+loaiTao+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
        
    }class quaCam extends Lab05{
        private String mauSac;
        public String getMauSac(){
            return mauSac;
        }
        public void setMauSac(String mauSac){
            this.mauSac = mauSac;
        }
        private String vi;
        public String getVi(){
            return vi;
        }
        public void setVi(String vi){
            this.vi = vi;
        }
        
        quaCam(){
            mauSac = "Cam";
            vi = "ngot";
        }
        quaCam(String mau, String v){
            mauSac = mau;
            vi = v;
        }
        public quaCam(String mau,String v, double gia, String ng, String nn, int sl){
            super(gia,ng,nn,sl);
            mauSac = mau;
            vi = v;
        }
        public String toString(){
            return "\nQua Cam: \n   Mau Sac: "+mauSac+"\n   Vi: "+vi+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
    }class camCaoPhong extends quaCam{
        camCaoPhong(){
            
        }
        camCaoPhong(String mau,String v, double gia, String ng, String nn, int sl){
            super(mau,v,gia,ng,nn,sl);
        }
        public String toString(){
            return "\nCam Cao Phong: \n   Mau Sac: "+getMauSac()+"\n   Vi: "+getVi()+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        
    }class camSanh extends quaCam{
        camSanh(){
            
        }
        camSanh(String mau,String v, double gia, String ng, String nn, int sl){
            super(mau,v,gia,ng,nn,sl);
            
        }
        public String toString(){
            return "\nCam Sanh: \n   Mau Sac: "+getMauSac()+"\n   Vi: "+getVi()+"\n   Gia Ban: "+getGiaBan()+"\n   Nguon Goc: "+getNguonGoc()+"\n   NgayNhap: "
                    +getNgayNhap()+"\n   SoLuong: "+getSoLuong();
        }
        public static void main(String[] args) {
        // TODO code application logic here
        hoaQua a = new hoaQua();
        
        quaTao b = new quaTao();
        quaCam c = new quaCam();
        camCaoPhong d = new camCaoPhong();
        camSanh e = new camSanh();
        System.out.print(a.toString());
        System.out.print(b.toString());
        System.out.print(c.toString());
        System.out.print(d.toString());
        System.out.print(e.toString());
        
        
    }

    }
    