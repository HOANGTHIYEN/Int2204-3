/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1.Lab05;

/**
 *
 * @author Administrator
 */
public class QuaTao  extends HoaQua{
    String LoaiTao; //the loại táo

    public String getLoaiTao() {
        return LoaiTao;
    }

    public void setLoaiTao(String LoaiTao) {
        this.LoaiTao = LoaiTao;
    }
     public void getinfo() {
        System.out.println(LoaiTao +"\n");
    }
    
}
