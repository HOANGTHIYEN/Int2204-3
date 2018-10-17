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
public class quacam extends Hoaqua{
    
    String ngaynhap;
    String soluong;

    

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
    String getInfo(){
        return "Tên: "+ten+"\nMàu sắc: "+mau+"\nNgày nhập:"
                +ngaynhap+"\nSố lượng: "+soluong;
    }
    
    
    
}
