/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author thang
 */
class camsanh extends quacam{                                                   //thua ke class quacam
    String giaban;
    String nguongoc;
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
    
    @Override
    String getInfo(){
        return "Tên: "+ten+"\nMàu sắc: "+mau+"\nNguồn gốc: "+nguongoc+"\nNgày nhập:"
                +ngaynhap+"\nSố lượng: "+soluong+"\nGiá bán: "+giaban;
    }
    
    
}

