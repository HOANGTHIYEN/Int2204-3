package lab5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class quatao extends Hoaqua {
    String giaban;
    String nguongoc;
    String ngaynhap;
    

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    
   
    String getInfo(){
        return "Tên: "+ten+"\nMàu sắc: "+mau+"\nNguồn gốc: "+nguongoc+"\nNgày nhập:"
                +ngaynhap+"\nGiá bán: "+giaban;
    }
    
    
}
