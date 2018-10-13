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
public class camphong extends quacam {
    String vi;

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }
    @Override
    String getInfo(){
        return "Tên: "+ten+"\nMàu sắc: "+mau+"\nNgày nhập:"
                +ngaynhap+"\nSố lượng: "+soluong+"Vị: "+vi;
    }
    
}