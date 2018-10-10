/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaQua;

/**
 *
 * @author 123456789
 */

public class hoaQua {
        String name;
        String nguonGoc;
        String ngayNhap;
        int soLuong;
        int giaBan;
        public hoaQua(){};
        public void setName(String name){
            this.name = name;
        }
        
        public String getName(){
            return name;
        }
        
        public void setNguonGoc(String nguonGoc){
            this.nguonGoc = nguonGoc;
        }

        public String getNguonGoc(){
            return nguonGoc;
        }

        public void setNgayNhap(String ngayNhap){
            this.ngayNhap = ngayNhap;
        }

        public String getNgayNhap(){
            return ngayNhap;
        }
        public void setSoLuong(int soLuong){
            this.soLuong = soLuong;
        }

        public int getSoLuong(){
            return soLuong;
        }
        
        public hoaQua(String name, String nguonGoc, String ngayNhap, int soLuong, int giaBan){
            this.name = name;
            this.nguonGoc = nguonGoc;
            this.ngayNhap = ngayNhap;
            this.soLuong = soLuong;
            this.giaBan = giaBan;
        }
        
        public hoaQua(String name, String nguonGoc, String ngayNhap, int soLuong){
            this.name = name;
            this.nguonGoc = nguonGoc;
            this.ngayNhap = ngayNhap;
            this.soLuong = soLuong;
        }
        
        public void setGiaBan(int giaBan){
            this.giaBan = giaBan;
        }
        
        public int getGiaBan(){
            return giaBan;
        }
        
        public String getInfo(){
            return "\nName : " + getName()+"\nFrom : " + getNguonGoc()+ "\nDate : " + getNgayNhap()+"\nSo Luong : "+getSoLuong() + "\nGia : "+getGiaBan();
        }
        
        public static void main(String[] args) {
        hoaQua cam = new hoaQua("Orange","China","20/04/2018",25000);
        System.out.println(cam.getInfo());
        quaCam xin = new quaCam("Orange","Newzeland","A+","1/1/2018",1000,50000);
        System.out.println(xin.getInfo());
        quaTao fake = new quaTao("Apple","Japan","D","1/4/2018",10000,10000);
        System.out.println(fake.getInfo());
        camSanh test1 = new camSanh("Orange 1","Viet Nam","09/04/2018",10000,25000);
        System.out.println(test1.getInfo());
        camCaoPhong test2 = new camCaoPhong("Orange 2","Viet Nam","20/04/2018",1000,26000);
        System.out.println(test2.getInfo());
        
        // TODO code application logic here
    }
    }
    







