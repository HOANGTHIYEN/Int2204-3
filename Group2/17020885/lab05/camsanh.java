/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Dell
 */
class camsanh extends quacam{
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
    
    String getInfo(){
        return "Tên: "+ten+"\nMàu sắc: "+mau+"\nNguồn gốc: "+nguongoc+"\nNgày nhập:"
                +ngaynhap+"\nSố lượng: "+soluong+"\nGiá bán: "+giaban;
    }
    
    
}

